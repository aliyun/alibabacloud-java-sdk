// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeTransferHistoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeTransferHistoryResponseBody body;

    public static DescribeTransferHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTransferHistoryResponse self = new DescribeTransferHistoryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTransferHistoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeTransferHistoryResponse setBody(DescribeTransferHistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTransferHistoryResponseBody getBody() {
        return this.body;
    }

}

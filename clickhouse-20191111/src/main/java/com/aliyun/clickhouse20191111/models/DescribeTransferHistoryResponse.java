// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeTransferHistoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DescribeTransferHistoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeTransferHistoryResponse setBody(DescribeTransferHistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeTransferHistoryResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cassandra20190101.models;

import com.aliyun.tea.*;

public class DescribeNodeToolExecutionHistoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeNodeToolExecutionHistoryResponseBody body;

    public static DescribeNodeToolExecutionHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNodeToolExecutionHistoryResponse self = new DescribeNodeToolExecutionHistoryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNodeToolExecutionHistoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNodeToolExecutionHistoryResponse setBody(DescribeNodeToolExecutionHistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNodeToolExecutionHistoryResponseBody getBody() {
        return this.body;
    }

}

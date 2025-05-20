// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DescribeQueryExplainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeQueryExplainResponseBody body;

    public static DescribeQueryExplainResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeQueryExplainResponse self = new DescribeQueryExplainResponse();
        return TeaModel.build(map, self);
    }

    public DescribeQueryExplainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeQueryExplainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeQueryExplainResponse setBody(DescribeQueryExplainResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeQueryExplainResponseBody getBody() {
        return this.body;
    }

}

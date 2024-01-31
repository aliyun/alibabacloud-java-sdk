// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeExternalAgentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeExternalAgentResponseBody body;

    public static DescribeExternalAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeExternalAgentResponse self = new DescribeExternalAgentResponse();
        return TeaModel.build(map, self);
    }

    public DescribeExternalAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeExternalAgentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeExternalAgentResponse setBody(DescribeExternalAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeExternalAgentResponseBody getBody() {
        return this.body;
    }

}

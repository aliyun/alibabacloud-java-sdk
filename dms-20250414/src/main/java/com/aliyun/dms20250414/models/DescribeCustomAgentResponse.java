// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class DescribeCustomAgentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCustomAgentResponseBody body;

    public static DescribeCustomAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomAgentResponse self = new DescribeCustomAgentResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCustomAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCustomAgentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCustomAgentResponse setBody(DescribeCustomAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCustomAgentResponseBody getBody() {
        return this.body;
    }

}

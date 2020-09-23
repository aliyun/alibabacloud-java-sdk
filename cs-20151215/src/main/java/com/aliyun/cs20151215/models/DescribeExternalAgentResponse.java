// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeExternalAgentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeExternalAgentResponse setBody(DescribeExternalAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeExternalAgentResponseBody getBody() {
        return this.body;
    }

}

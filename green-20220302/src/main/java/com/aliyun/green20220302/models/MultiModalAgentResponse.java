// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class MultiModalAgentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MultiModalAgentResponseBody body;

    public static MultiModalAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        MultiModalAgentResponse self = new MultiModalAgentResponse();
        return TeaModel.build(map, self);
    }

    public MultiModalAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MultiModalAgentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MultiModalAgentResponse setBody(MultiModalAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public MultiModalAgentResponseBody getBody() {
        return this.body;
    }

}

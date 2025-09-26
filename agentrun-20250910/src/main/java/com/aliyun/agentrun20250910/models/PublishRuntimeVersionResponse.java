// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class PublishRuntimeVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AgentRuntimeVersionResult body;

    public static PublishRuntimeVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        PublishRuntimeVersionResponse self = new PublishRuntimeVersionResponse();
        return TeaModel.build(map, self);
    }

    public PublishRuntimeVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PublishRuntimeVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PublishRuntimeVersionResponse setBody(AgentRuntimeVersionResult body) {
        this.body = body;
        return this;
    }
    public AgentRuntimeVersionResult getBody() {
        return this.body;
    }

}

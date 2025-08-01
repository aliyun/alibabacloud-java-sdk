// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreateSentinelBlockFallbackDefinitionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSentinelBlockFallbackDefinitionResponseBody body;

    public static CreateSentinelBlockFallbackDefinitionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSentinelBlockFallbackDefinitionResponse self = new CreateSentinelBlockFallbackDefinitionResponse();
        return TeaModel.build(map, self);
    }

    public CreateSentinelBlockFallbackDefinitionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSentinelBlockFallbackDefinitionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSentinelBlockFallbackDefinitionResponse setBody(CreateSentinelBlockFallbackDefinitionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSentinelBlockFallbackDefinitionResponseBody getBody() {
        return this.body;
    }

}

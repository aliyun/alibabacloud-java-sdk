// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class UnbindSentinelBlockFallbackDefinitionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UnbindSentinelBlockFallbackDefinitionResponseBody body;

    public static UnbindSentinelBlockFallbackDefinitionResponse build(java.util.Map<String, ?> map) throws Exception {
        UnbindSentinelBlockFallbackDefinitionResponse self = new UnbindSentinelBlockFallbackDefinitionResponse();
        return TeaModel.build(map, self);
    }

    public UnbindSentinelBlockFallbackDefinitionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnbindSentinelBlockFallbackDefinitionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnbindSentinelBlockFallbackDefinitionResponse setBody(UnbindSentinelBlockFallbackDefinitionResponseBody body) {
        this.body = body;
        return this;
    }
    public UnbindSentinelBlockFallbackDefinitionResponseBody getBody() {
        return this.body;
    }

}

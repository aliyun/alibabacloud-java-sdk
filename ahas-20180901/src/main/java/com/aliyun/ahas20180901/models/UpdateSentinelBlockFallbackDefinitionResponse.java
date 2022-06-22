// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class UpdateSentinelBlockFallbackDefinitionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateSentinelBlockFallbackDefinitionResponseBody body;

    public static UpdateSentinelBlockFallbackDefinitionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSentinelBlockFallbackDefinitionResponse self = new UpdateSentinelBlockFallbackDefinitionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSentinelBlockFallbackDefinitionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSentinelBlockFallbackDefinitionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSentinelBlockFallbackDefinitionResponse setBody(UpdateSentinelBlockFallbackDefinitionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSentinelBlockFallbackDefinitionResponseBody getBody() {
        return this.body;
    }

}

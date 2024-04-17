// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class BindSentinelBlockFallbackDefinitionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BindSentinelBlockFallbackDefinitionResponseBody body;

    public static BindSentinelBlockFallbackDefinitionResponse build(java.util.Map<String, ?> map) throws Exception {
        BindSentinelBlockFallbackDefinitionResponse self = new BindSentinelBlockFallbackDefinitionResponse();
        return TeaModel.build(map, self);
    }

    public BindSentinelBlockFallbackDefinitionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindSentinelBlockFallbackDefinitionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BindSentinelBlockFallbackDefinitionResponse setBody(BindSentinelBlockFallbackDefinitionResponseBody body) {
        this.body = body;
        return this;
    }
    public BindSentinelBlockFallbackDefinitionResponseBody getBody() {
        return this.body;
    }

}

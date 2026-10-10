// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterRenewApiKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelRouterRenewApiKeyResponseBody body;

    public static ModelRouterRenewApiKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterRenewApiKeyResponse self = new ModelRouterRenewApiKeyResponse();
        return TeaModel.build(map, self);
    }

    public ModelRouterRenewApiKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelRouterRenewApiKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelRouterRenewApiKeyResponse setBody(ModelRouterRenewApiKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelRouterRenewApiKeyResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterCreateApiKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelRouterCreateApiKeyResponseBody body;

    public static ModelRouterCreateApiKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterCreateApiKeyResponse self = new ModelRouterCreateApiKeyResponse();
        return TeaModel.build(map, self);
    }

    public ModelRouterCreateApiKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelRouterCreateApiKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelRouterCreateApiKeyResponse setBody(ModelRouterCreateApiKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelRouterCreateApiKeyResponseBody getBody() {
        return this.body;
    }

}

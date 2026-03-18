// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterDeleteApiKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelRouterDeleteApiKeyResponseBody body;

    public static ModelRouterDeleteApiKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterDeleteApiKeyResponse self = new ModelRouterDeleteApiKeyResponse();
        return TeaModel.build(map, self);
    }

    public ModelRouterDeleteApiKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelRouterDeleteApiKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelRouterDeleteApiKeyResponse setBody(ModelRouterDeleteApiKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelRouterDeleteApiKeyResponseBody getBody() {
        return this.body;
    }

}

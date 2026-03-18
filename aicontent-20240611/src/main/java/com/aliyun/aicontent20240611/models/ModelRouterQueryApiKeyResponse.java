// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterQueryApiKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelRouterQueryApiKeyResponseBody body;

    public static ModelRouterQueryApiKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterQueryApiKeyResponse self = new ModelRouterQueryApiKeyResponse();
        return TeaModel.build(map, self);
    }

    public ModelRouterQueryApiKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelRouterQueryApiKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelRouterQueryApiKeyResponse setBody(ModelRouterQueryApiKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelRouterQueryApiKeyResponseBody getBody() {
        return this.body;
    }

}

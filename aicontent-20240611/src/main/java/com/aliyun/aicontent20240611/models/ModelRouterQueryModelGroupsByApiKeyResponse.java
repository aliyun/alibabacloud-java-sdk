// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterQueryModelGroupsByApiKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelRouterQueryModelGroupsByApiKeyResponseBody body;

    public static ModelRouterQueryModelGroupsByApiKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterQueryModelGroupsByApiKeyResponse self = new ModelRouterQueryModelGroupsByApiKeyResponse();
        return TeaModel.build(map, self);
    }

    public ModelRouterQueryModelGroupsByApiKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelRouterQueryModelGroupsByApiKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelRouterQueryModelGroupsByApiKeyResponse setBody(ModelRouterQueryModelGroupsByApiKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelRouterQueryModelGroupsByApiKeyResponseBody getBody() {
        return this.body;
    }

}

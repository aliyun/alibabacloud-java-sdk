// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterQueryModelWithApiKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelRouterQueryModelWithApiKeyResponseBody body;

    public static ModelRouterQueryModelWithApiKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterQueryModelWithApiKeyResponse self = new ModelRouterQueryModelWithApiKeyResponse();
        return TeaModel.build(map, self);
    }

    public ModelRouterQueryModelWithApiKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelRouterQueryModelWithApiKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelRouterQueryModelWithApiKeyResponse setBody(ModelRouterQueryModelWithApiKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelRouterQueryModelWithApiKeyResponseBody getBody() {
        return this.body;
    }

}

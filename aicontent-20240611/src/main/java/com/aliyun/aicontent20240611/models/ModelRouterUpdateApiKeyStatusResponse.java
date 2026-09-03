// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterUpdateApiKeyStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelRouterUpdateApiKeyStatusResponseBody body;

    public static ModelRouterUpdateApiKeyStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterUpdateApiKeyStatusResponse self = new ModelRouterUpdateApiKeyStatusResponse();
        return TeaModel.build(map, self);
    }

    public ModelRouterUpdateApiKeyStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelRouterUpdateApiKeyStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelRouterUpdateApiKeyStatusResponse setBody(ModelRouterUpdateApiKeyStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelRouterUpdateApiKeyStatusResponseBody getBody() {
        return this.body;
    }

}

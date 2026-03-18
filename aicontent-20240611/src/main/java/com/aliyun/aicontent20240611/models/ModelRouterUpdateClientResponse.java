// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterUpdateClientResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelRouterUpdateClientResponseBody body;

    public static ModelRouterUpdateClientResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterUpdateClientResponse self = new ModelRouterUpdateClientResponse();
        return TeaModel.build(map, self);
    }

    public ModelRouterUpdateClientResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelRouterUpdateClientResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelRouterUpdateClientResponse setBody(ModelRouterUpdateClientResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelRouterUpdateClientResponseBody getBody() {
        return this.body;
    }

}

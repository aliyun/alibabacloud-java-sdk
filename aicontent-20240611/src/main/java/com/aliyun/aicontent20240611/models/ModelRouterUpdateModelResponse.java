// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterUpdateModelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelRouterUpdateModelResponseBody body;

    public static ModelRouterUpdateModelResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterUpdateModelResponse self = new ModelRouterUpdateModelResponse();
        return TeaModel.build(map, self);
    }

    public ModelRouterUpdateModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelRouterUpdateModelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelRouterUpdateModelResponse setBody(ModelRouterUpdateModelResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelRouterUpdateModelResponseBody getBody() {
        return this.body;
    }

}

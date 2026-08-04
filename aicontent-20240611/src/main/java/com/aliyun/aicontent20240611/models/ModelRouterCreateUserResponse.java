// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterCreateUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelRouterCreateUserResponseBody body;

    public static ModelRouterCreateUserResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterCreateUserResponse self = new ModelRouterCreateUserResponse();
        return TeaModel.build(map, self);
    }

    public ModelRouterCreateUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelRouterCreateUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelRouterCreateUserResponse setBody(ModelRouterCreateUserResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelRouterCreateUserResponseBody getBody() {
        return this.body;
    }

}

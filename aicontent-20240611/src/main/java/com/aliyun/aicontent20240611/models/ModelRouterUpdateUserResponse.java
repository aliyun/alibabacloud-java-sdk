// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterUpdateUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelRouterUpdateUserResponseBody body;

    public static ModelRouterUpdateUserResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterUpdateUserResponse self = new ModelRouterUpdateUserResponse();
        return TeaModel.build(map, self);
    }

    public ModelRouterUpdateUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelRouterUpdateUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelRouterUpdateUserResponse setBody(ModelRouterUpdateUserResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelRouterUpdateUserResponseBody getBody() {
        return this.body;
    }

}

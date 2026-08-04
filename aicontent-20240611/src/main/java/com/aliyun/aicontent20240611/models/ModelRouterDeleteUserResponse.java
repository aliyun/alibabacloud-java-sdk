// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterDeleteUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelRouterDeleteUserResponseBody body;

    public static ModelRouterDeleteUserResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterDeleteUserResponse self = new ModelRouterDeleteUserResponse();
        return TeaModel.build(map, self);
    }

    public ModelRouterDeleteUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelRouterDeleteUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelRouterDeleteUserResponse setBody(ModelRouterDeleteUserResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelRouterDeleteUserResponseBody getBody() {
        return this.body;
    }

}

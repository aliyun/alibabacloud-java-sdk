// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterSetUserRolesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelRouterSetUserRolesResponseBody body;

    public static ModelRouterSetUserRolesResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterSetUserRolesResponse self = new ModelRouterSetUserRolesResponse();
        return TeaModel.build(map, self);
    }

    public ModelRouterSetUserRolesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelRouterSetUserRolesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelRouterSetUserRolesResponse setBody(ModelRouterSetUserRolesResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelRouterSetUserRolesResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterSetMemberAuthorizationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelRouterSetMemberAuthorizationResponseBody body;

    public static ModelRouterSetMemberAuthorizationResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterSetMemberAuthorizationResponse self = new ModelRouterSetMemberAuthorizationResponse();
        return TeaModel.build(map, self);
    }

    public ModelRouterSetMemberAuthorizationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelRouterSetMemberAuthorizationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelRouterSetMemberAuthorizationResponse setBody(ModelRouterSetMemberAuthorizationResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelRouterSetMemberAuthorizationResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterResetMemberAuthorizationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelRouterResetMemberAuthorizationResponseBody body;

    public static ModelRouterResetMemberAuthorizationResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterResetMemberAuthorizationResponse self = new ModelRouterResetMemberAuthorizationResponse();
        return TeaModel.build(map, self);
    }

    public ModelRouterResetMemberAuthorizationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelRouterResetMemberAuthorizationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelRouterResetMemberAuthorizationResponse setBody(ModelRouterResetMemberAuthorizationResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelRouterResetMemberAuthorizationResponseBody getBody() {
        return this.body;
    }

}

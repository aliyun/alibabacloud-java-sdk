// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterBatchResetMemberAuthorizationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelRouterBatchResetMemberAuthorizationResponseBody body;

    public static ModelRouterBatchResetMemberAuthorizationResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterBatchResetMemberAuthorizationResponse self = new ModelRouterBatchResetMemberAuthorizationResponse();
        return TeaModel.build(map, self);
    }

    public ModelRouterBatchResetMemberAuthorizationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelRouterBatchResetMemberAuthorizationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelRouterBatchResetMemberAuthorizationResponse setBody(ModelRouterBatchResetMemberAuthorizationResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelRouterBatchResetMemberAuthorizationResponseBody getBody() {
        return this.body;
    }

}

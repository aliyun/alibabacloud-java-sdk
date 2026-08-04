// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterBatchSetMemberAuthorizationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelRouterBatchSetMemberAuthorizationResponseBody body;

    public static ModelRouterBatchSetMemberAuthorizationResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterBatchSetMemberAuthorizationResponse self = new ModelRouterBatchSetMemberAuthorizationResponse();
        return TeaModel.build(map, self);
    }

    public ModelRouterBatchSetMemberAuthorizationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelRouterBatchSetMemberAuthorizationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelRouterBatchSetMemberAuthorizationResponse setBody(ModelRouterBatchSetMemberAuthorizationResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelRouterBatchSetMemberAuthorizationResponseBody getBody() {
        return this.body;
    }

}

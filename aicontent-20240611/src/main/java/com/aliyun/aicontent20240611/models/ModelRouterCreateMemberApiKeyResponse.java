// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterCreateMemberApiKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelRouterCreateMemberApiKeyResponseBody body;

    public static ModelRouterCreateMemberApiKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterCreateMemberApiKeyResponse self = new ModelRouterCreateMemberApiKeyResponse();
        return TeaModel.build(map, self);
    }

    public ModelRouterCreateMemberApiKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelRouterCreateMemberApiKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelRouterCreateMemberApiKeyResponse setBody(ModelRouterCreateMemberApiKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelRouterCreateMemberApiKeyResponseBody getBody() {
        return this.body;
    }

}

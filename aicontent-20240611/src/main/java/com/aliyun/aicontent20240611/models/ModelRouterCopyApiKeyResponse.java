// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterCopyApiKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelRouterCopyApiKeyResponseBody body;

    public static ModelRouterCopyApiKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterCopyApiKeyResponse self = new ModelRouterCopyApiKeyResponse();
        return TeaModel.build(map, self);
    }

    public ModelRouterCopyApiKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelRouterCopyApiKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelRouterCopyApiKeyResponse setBody(ModelRouterCopyApiKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelRouterCopyApiKeyResponseBody getBody() {
        return this.body;
    }

}

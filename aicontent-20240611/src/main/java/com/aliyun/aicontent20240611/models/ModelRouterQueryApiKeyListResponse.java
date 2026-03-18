// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterQueryApiKeyListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelRouterQueryApiKeyListResponseBody body;

    public static ModelRouterQueryApiKeyListResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterQueryApiKeyListResponse self = new ModelRouterQueryApiKeyListResponse();
        return TeaModel.build(map, self);
    }

    public ModelRouterQueryApiKeyListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelRouterQueryApiKeyListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelRouterQueryApiKeyListResponse setBody(ModelRouterQueryApiKeyListResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelRouterQueryApiKeyListResponseBody getBody() {
        return this.body;
    }

}

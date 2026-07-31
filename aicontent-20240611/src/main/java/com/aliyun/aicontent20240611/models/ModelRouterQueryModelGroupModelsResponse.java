// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterQueryModelGroupModelsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelRouterQueryModelGroupModelsResponseBody body;

    public static ModelRouterQueryModelGroupModelsResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterQueryModelGroupModelsResponse self = new ModelRouterQueryModelGroupModelsResponse();
        return TeaModel.build(map, self);
    }

    public ModelRouterQueryModelGroupModelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelRouterQueryModelGroupModelsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelRouterQueryModelGroupModelsResponse setBody(ModelRouterQueryModelGroupModelsResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelRouterQueryModelGroupModelsResponseBody getBody() {
        return this.body;
    }

}

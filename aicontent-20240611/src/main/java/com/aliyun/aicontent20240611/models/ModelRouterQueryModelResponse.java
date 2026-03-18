// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterQueryModelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelRouterQueryModelResponseBody body;

    public static ModelRouterQueryModelResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterQueryModelResponse self = new ModelRouterQueryModelResponse();
        return TeaModel.build(map, self);
    }

    public ModelRouterQueryModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelRouterQueryModelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelRouterQueryModelResponse setBody(ModelRouterQueryModelResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelRouterQueryModelResponseBody getBody() {
        return this.body;
    }

}

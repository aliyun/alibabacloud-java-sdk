// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterQueryNacosProvidersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelRouterQueryNacosProvidersResponseBody body;

    public static ModelRouterQueryNacosProvidersResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterQueryNacosProvidersResponse self = new ModelRouterQueryNacosProvidersResponse();
        return TeaModel.build(map, self);
    }

    public ModelRouterQueryNacosProvidersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelRouterQueryNacosProvidersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelRouterQueryNacosProvidersResponse setBody(ModelRouterQueryNacosProvidersResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelRouterQueryNacosProvidersResponseBody getBody() {
        return this.body;
    }

}

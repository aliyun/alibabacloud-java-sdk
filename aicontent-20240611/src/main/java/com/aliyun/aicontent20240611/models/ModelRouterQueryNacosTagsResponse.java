// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterQueryNacosTagsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelRouterQueryNacosTagsResponseBody body;

    public static ModelRouterQueryNacosTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterQueryNacosTagsResponse self = new ModelRouterQueryNacosTagsResponse();
        return TeaModel.build(map, self);
    }

    public ModelRouterQueryNacosTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelRouterQueryNacosTagsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelRouterQueryNacosTagsResponse setBody(ModelRouterQueryNacosTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelRouterQueryNacosTagsResponseBody getBody() {
        return this.body;
    }

}

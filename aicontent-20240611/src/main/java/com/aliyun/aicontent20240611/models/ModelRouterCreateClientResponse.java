// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterCreateClientResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelRouterCreateClientResponseBody body;

    public static ModelRouterCreateClientResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterCreateClientResponse self = new ModelRouterCreateClientResponse();
        return TeaModel.build(map, self);
    }

    public ModelRouterCreateClientResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelRouterCreateClientResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelRouterCreateClientResponse setBody(ModelRouterCreateClientResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelRouterCreateClientResponseBody getBody() {
        return this.body;
    }

}

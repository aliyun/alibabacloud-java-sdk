// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterDeleteClientResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelRouterDeleteClientResponseBody body;

    public static ModelRouterDeleteClientResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterDeleteClientResponse self = new ModelRouterDeleteClientResponse();
        return TeaModel.build(map, self);
    }

    public ModelRouterDeleteClientResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelRouterDeleteClientResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelRouterDeleteClientResponse setBody(ModelRouterDeleteClientResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelRouterDeleteClientResponseBody getBody() {
        return this.body;
    }

}

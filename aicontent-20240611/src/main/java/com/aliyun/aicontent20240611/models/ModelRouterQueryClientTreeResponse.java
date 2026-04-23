// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterQueryClientTreeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelRouterQueryClientTreeResponseBody body;

    public static ModelRouterQueryClientTreeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterQueryClientTreeResponse self = new ModelRouterQueryClientTreeResponse();
        return TeaModel.build(map, self);
    }

    public ModelRouterQueryClientTreeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelRouterQueryClientTreeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelRouterQueryClientTreeResponse setBody(ModelRouterQueryClientTreeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelRouterQueryClientTreeResponseBody getBody() {
        return this.body;
    }

}

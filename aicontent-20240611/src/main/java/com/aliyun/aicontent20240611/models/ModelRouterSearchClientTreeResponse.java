// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterSearchClientTreeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelRouterSearchClientTreeResponseBody body;

    public static ModelRouterSearchClientTreeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterSearchClientTreeResponse self = new ModelRouterSearchClientTreeResponse();
        return TeaModel.build(map, self);
    }

    public ModelRouterSearchClientTreeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelRouterSearchClientTreeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelRouterSearchClientTreeResponse setBody(ModelRouterSearchClientTreeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelRouterSearchClientTreeResponseBody getBody() {
        return this.body;
    }

}

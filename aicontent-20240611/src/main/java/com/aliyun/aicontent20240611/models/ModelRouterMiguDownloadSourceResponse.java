// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterMiguDownloadSourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelRouterMiguDownloadSourceResponseBody body;

    public static ModelRouterMiguDownloadSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterMiguDownloadSourceResponse self = new ModelRouterMiguDownloadSourceResponse();
        return TeaModel.build(map, self);
    }

    public ModelRouterMiguDownloadSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelRouterMiguDownloadSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelRouterMiguDownloadSourceResponse setBody(ModelRouterMiguDownloadSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelRouterMiguDownloadSourceResponseBody getBody() {
        return this.body;
    }

}

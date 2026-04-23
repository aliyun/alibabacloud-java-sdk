// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterQueryClientDiscountLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelRouterQueryClientDiscountLogsResponseBody body;

    public static ModelRouterQueryClientDiscountLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterQueryClientDiscountLogsResponse self = new ModelRouterQueryClientDiscountLogsResponse();
        return TeaModel.build(map, self);
    }

    public ModelRouterQueryClientDiscountLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelRouterQueryClientDiscountLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelRouterQueryClientDiscountLogsResponse setBody(ModelRouterQueryClientDiscountLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelRouterQueryClientDiscountLogsResponseBody getBody() {
        return this.body;
    }

}

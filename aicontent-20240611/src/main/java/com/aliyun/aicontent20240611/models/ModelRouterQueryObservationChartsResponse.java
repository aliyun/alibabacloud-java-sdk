// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterQueryObservationChartsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelRouterQueryObservationChartsResponseBody body;

    public static ModelRouterQueryObservationChartsResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterQueryObservationChartsResponse self = new ModelRouterQueryObservationChartsResponse();
        return TeaModel.build(map, self);
    }

    public ModelRouterQueryObservationChartsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelRouterQueryObservationChartsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelRouterQueryObservationChartsResponse setBody(ModelRouterQueryObservationChartsResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelRouterQueryObservationChartsResponseBody getBody() {
        return this.body;
    }

}

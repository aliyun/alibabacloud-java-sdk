// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterQueryObservationLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelRouterQueryObservationLogsResponseBody body;

    public static ModelRouterQueryObservationLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterQueryObservationLogsResponse self = new ModelRouterQueryObservationLogsResponse();
        return TeaModel.build(map, self);
    }

    public ModelRouterQueryObservationLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelRouterQueryObservationLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelRouterQueryObservationLogsResponse setBody(ModelRouterQueryObservationLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelRouterQueryObservationLogsResponseBody getBody() {
        return this.body;
    }

}

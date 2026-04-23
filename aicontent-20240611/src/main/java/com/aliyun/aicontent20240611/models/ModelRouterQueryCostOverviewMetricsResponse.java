// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterQueryCostOverviewMetricsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelRouterQueryCostOverviewMetricsResponseBody body;

    public static ModelRouterQueryCostOverviewMetricsResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterQueryCostOverviewMetricsResponse self = new ModelRouterQueryCostOverviewMetricsResponse();
        return TeaModel.build(map, self);
    }

    public ModelRouterQueryCostOverviewMetricsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelRouterQueryCostOverviewMetricsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelRouterQueryCostOverviewMetricsResponse setBody(ModelRouterQueryCostOverviewMetricsResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelRouterQueryCostOverviewMetricsResponseBody getBody() {
        return this.body;
    }

}

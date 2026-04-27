// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterQueryUsageBreakdownResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelRouterQueryUsageBreakdownResponseBody body;

    public static ModelRouterQueryUsageBreakdownResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterQueryUsageBreakdownResponse self = new ModelRouterQueryUsageBreakdownResponse();
        return TeaModel.build(map, self);
    }

    public ModelRouterQueryUsageBreakdownResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelRouterQueryUsageBreakdownResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelRouterQueryUsageBreakdownResponse setBody(ModelRouterQueryUsageBreakdownResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelRouterQueryUsageBreakdownResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterQueryCostModelDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelRouterQueryCostModelDetailResponseBody body;

    public static ModelRouterQueryCostModelDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterQueryCostModelDetailResponse self = new ModelRouterQueryCostModelDetailResponse();
        return TeaModel.build(map, self);
    }

    public ModelRouterQueryCostModelDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelRouterQueryCostModelDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelRouterQueryCostModelDetailResponse setBody(ModelRouterQueryCostModelDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelRouterQueryCostModelDetailResponseBody getBody() {
        return this.body;
    }

}

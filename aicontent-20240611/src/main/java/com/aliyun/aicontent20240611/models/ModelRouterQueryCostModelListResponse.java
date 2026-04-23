// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterQueryCostModelListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelRouterQueryCostModelListResponseBody body;

    public static ModelRouterQueryCostModelListResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterQueryCostModelListResponse self = new ModelRouterQueryCostModelListResponse();
        return TeaModel.build(map, self);
    }

    public ModelRouterQueryCostModelListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelRouterQueryCostModelListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelRouterQueryCostModelListResponse setBody(ModelRouterQueryCostModelListResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelRouterQueryCostModelListResponseBody getBody() {
        return this.body;
    }

}

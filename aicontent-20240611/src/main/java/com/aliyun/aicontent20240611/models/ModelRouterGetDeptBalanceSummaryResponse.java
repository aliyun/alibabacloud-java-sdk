// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterGetDeptBalanceSummaryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelRouterGetDeptBalanceSummaryResponseBody body;

    public static ModelRouterGetDeptBalanceSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterGetDeptBalanceSummaryResponse self = new ModelRouterGetDeptBalanceSummaryResponse();
        return TeaModel.build(map, self);
    }

    public ModelRouterGetDeptBalanceSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelRouterGetDeptBalanceSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelRouterGetDeptBalanceSummaryResponse setBody(ModelRouterGetDeptBalanceSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelRouterGetDeptBalanceSummaryResponseBody getBody() {
        return this.body;
    }

}

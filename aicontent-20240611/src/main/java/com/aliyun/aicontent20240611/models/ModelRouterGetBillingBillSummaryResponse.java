// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterGetBillingBillSummaryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModelRouterGetBillingBillSummaryResponseBody body;

    public static ModelRouterGetBillingBillSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterGetBillingBillSummaryResponse self = new ModelRouterGetBillingBillSummaryResponse();
        return TeaModel.build(map, self);
    }

    public ModelRouterGetBillingBillSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModelRouterGetBillingBillSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModelRouterGetBillingBillSummaryResponse setBody(ModelRouterGetBillingBillSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public ModelRouterGetBillingBillSummaryResponseBody getBody() {
        return this.body;
    }

}

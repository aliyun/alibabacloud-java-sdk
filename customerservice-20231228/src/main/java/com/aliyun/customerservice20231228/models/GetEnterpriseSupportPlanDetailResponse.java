// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.customerservice20231228.models;

import com.aliyun.tea.*;

public class GetEnterpriseSupportPlanDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetEnterpriseSupportPlanDetailResponseBody body;

    public static GetEnterpriseSupportPlanDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEnterpriseSupportPlanDetailResponse self = new GetEnterpriseSupportPlanDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetEnterpriseSupportPlanDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEnterpriseSupportPlanDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEnterpriseSupportPlanDetailResponse setBody(GetEnterpriseSupportPlanDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEnterpriseSupportPlanDetailResponseBody getBody() {
        return this.body;
    }

}

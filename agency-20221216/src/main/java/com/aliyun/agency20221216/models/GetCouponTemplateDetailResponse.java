// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class GetCouponTemplateDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCouponTemplateDetailResponseBody body;

    public static GetCouponTemplateDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCouponTemplateDetailResponse self = new GetCouponTemplateDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetCouponTemplateDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCouponTemplateDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCouponTemplateDetailResponse setBody(GetCouponTemplateDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCouponTemplateDetailResponseBody getBody() {
        return this.body;
    }

}

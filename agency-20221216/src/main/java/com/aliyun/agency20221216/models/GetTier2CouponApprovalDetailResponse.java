// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class GetTier2CouponApprovalDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTier2CouponApprovalDetailResponseBody body;

    public static GetTier2CouponApprovalDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTier2CouponApprovalDetailResponse self = new GetTier2CouponApprovalDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetTier2CouponApprovalDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTier2CouponApprovalDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTier2CouponApprovalDetailResponse setBody(GetTier2CouponApprovalDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTier2CouponApprovalDetailResponseBody getBody() {
        return this.body;
    }

}

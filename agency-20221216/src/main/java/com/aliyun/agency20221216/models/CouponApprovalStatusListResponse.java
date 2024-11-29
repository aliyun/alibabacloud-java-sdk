// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class CouponApprovalStatusListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CouponApprovalStatusListResponseBody body;

    public static CouponApprovalStatusListResponse build(java.util.Map<String, ?> map) throws Exception {
        CouponApprovalStatusListResponse self = new CouponApprovalStatusListResponse();
        return TeaModel.build(map, self);
    }

    public CouponApprovalStatusListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CouponApprovalStatusListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CouponApprovalStatusListResponse setBody(CouponApprovalStatusListResponseBody body) {
        this.body = body;
        return this;
    }
    public CouponApprovalStatusListResponseBody getBody() {
        return this.body;
    }

}

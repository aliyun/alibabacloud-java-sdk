// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class ListTier2CouponApprovalResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTier2CouponApprovalResponseBody body;

    public static ListTier2CouponApprovalResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTier2CouponApprovalResponse self = new ListTier2CouponApprovalResponse();
        return TeaModel.build(map, self);
    }

    public ListTier2CouponApprovalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTier2CouponApprovalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTier2CouponApprovalResponse setBody(ListTier2CouponApprovalResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTier2CouponApprovalResponseBody getBody() {
        return this.body;
    }

}

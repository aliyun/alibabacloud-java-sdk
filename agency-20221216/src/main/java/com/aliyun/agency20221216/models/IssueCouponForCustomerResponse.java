// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class IssueCouponForCustomerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public IssueCouponForCustomerResponseBody body;

    public static IssueCouponForCustomerResponse build(java.util.Map<String, ?> map) throws Exception {
        IssueCouponForCustomerResponse self = new IssueCouponForCustomerResponse();
        return TeaModel.build(map, self);
    }

    public IssueCouponForCustomerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public IssueCouponForCustomerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public IssueCouponForCustomerResponse setBody(IssueCouponForCustomerResponseBody body) {
        this.body = body;
        return this;
    }
    public IssueCouponForCustomerResponseBody getBody() {
        return this.body;
    }

}

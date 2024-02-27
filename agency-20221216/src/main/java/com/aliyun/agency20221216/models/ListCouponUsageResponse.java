// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class ListCouponUsageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListCouponUsageResponseBody body;

    public static ListCouponUsageResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCouponUsageResponse self = new ListCouponUsageResponse();
        return TeaModel.build(map, self);
    }

    public ListCouponUsageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCouponUsageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListCouponUsageResponse setBody(ListCouponUsageResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCouponUsageResponseBody getBody() {
        return this.body;
    }

}

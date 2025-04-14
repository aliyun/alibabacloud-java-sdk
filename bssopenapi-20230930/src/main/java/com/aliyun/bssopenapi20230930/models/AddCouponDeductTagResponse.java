// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class AddCouponDeductTagResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddCouponDeductTagResponseBody body;

    public static AddCouponDeductTagResponse build(java.util.Map<String, ?> map) throws Exception {
        AddCouponDeductTagResponse self = new AddCouponDeductTagResponse();
        return TeaModel.build(map, self);
    }

    public AddCouponDeductTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddCouponDeductTagResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddCouponDeductTagResponse setBody(AddCouponDeductTagResponseBody body) {
        this.body = body;
        return this;
    }
    public AddCouponDeductTagResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class DeleteCouponDeductTagResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCouponDeductTagResponseBody body;

    public static DeleteCouponDeductTagResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCouponDeductTagResponse self = new DeleteCouponDeductTagResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCouponDeductTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCouponDeductTagResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCouponDeductTagResponse setBody(DeleteCouponDeductTagResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCouponDeductTagResponseBody getBody() {
        return this.body;
    }

}

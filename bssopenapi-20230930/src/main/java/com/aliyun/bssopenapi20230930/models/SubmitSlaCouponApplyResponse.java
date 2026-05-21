// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class SubmitSlaCouponApplyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubmitSlaCouponApplyResponseBody body;

    public static SubmitSlaCouponApplyResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitSlaCouponApplyResponse self = new SubmitSlaCouponApplyResponse();
        return TeaModel.build(map, self);
    }

    public SubmitSlaCouponApplyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitSlaCouponApplyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitSlaCouponApplyResponse setBody(SubmitSlaCouponApplyResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitSlaCouponApplyResponseBody getBody() {
        return this.body;
    }

}

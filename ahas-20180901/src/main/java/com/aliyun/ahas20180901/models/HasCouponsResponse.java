// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class HasCouponsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public HasCouponsResponseBody body;

    public static HasCouponsResponse build(java.util.Map<String, ?> map) throws Exception {
        HasCouponsResponse self = new HasCouponsResponse();
        return TeaModel.build(map, self);
    }

    public HasCouponsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public HasCouponsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public HasCouponsResponse setBody(HasCouponsResponseBody body) {
        this.body = body;
        return this;
    }
    public HasCouponsResponseBody getBody() {
        return this.body;
    }

}

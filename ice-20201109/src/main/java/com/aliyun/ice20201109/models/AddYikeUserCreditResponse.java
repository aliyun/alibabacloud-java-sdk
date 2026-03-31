// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class AddYikeUserCreditResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddYikeUserCreditResponseBody body;

    public static AddYikeUserCreditResponse build(java.util.Map<String, ?> map) throws Exception {
        AddYikeUserCreditResponse self = new AddYikeUserCreditResponse();
        return TeaModel.build(map, self);
    }

    public AddYikeUserCreditResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddYikeUserCreditResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddYikeUserCreditResponse setBody(AddYikeUserCreditResponseBody body) {
        this.body = body;
        return this;
    }
    public AddYikeUserCreditResponseBody getBody() {
        return this.body;
    }

}

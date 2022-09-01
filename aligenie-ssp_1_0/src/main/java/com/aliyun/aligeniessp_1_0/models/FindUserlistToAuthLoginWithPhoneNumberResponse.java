// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class FindUserlistToAuthLoginWithPhoneNumberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public FindUserlistToAuthLoginWithPhoneNumberResponseBody body;

    public static FindUserlistToAuthLoginWithPhoneNumberResponse build(java.util.Map<String, ?> map) throws Exception {
        FindUserlistToAuthLoginWithPhoneNumberResponse self = new FindUserlistToAuthLoginWithPhoneNumberResponse();
        return TeaModel.build(map, self);
    }

    public FindUserlistToAuthLoginWithPhoneNumberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FindUserlistToAuthLoginWithPhoneNumberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FindUserlistToAuthLoginWithPhoneNumberResponse setBody(FindUserlistToAuthLoginWithPhoneNumberResponseBody body) {
        this.body = body;
        return this;
    }
    public FindUserlistToAuthLoginWithPhoneNumberResponseBody getBody() {
        return this.body;
    }

}

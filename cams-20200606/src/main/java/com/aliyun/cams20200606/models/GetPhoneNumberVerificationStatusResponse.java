// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetPhoneNumberVerificationStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPhoneNumberVerificationStatusResponseBody body;

    public static GetPhoneNumberVerificationStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPhoneNumberVerificationStatusResponse self = new GetPhoneNumberVerificationStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetPhoneNumberVerificationStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPhoneNumberVerificationStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPhoneNumberVerificationStatusResponse setBody(GetPhoneNumberVerificationStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPhoneNumberVerificationStatusResponseBody getBody() {
        return this.body;
    }

}

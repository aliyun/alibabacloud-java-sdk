// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi20170525.models;

import com.aliyun.tea.*;

public class GetPhoneWithTokenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetPhoneWithTokenResponseBody body;

    public static GetPhoneWithTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPhoneWithTokenResponse self = new GetPhoneWithTokenResponse();
        return TeaModel.build(map, self);
    }

    public GetPhoneWithTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPhoneWithTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPhoneWithTokenResponse setBody(GetPhoneWithTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPhoneWithTokenResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class PhoneNumberStatusForVoiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PhoneNumberStatusForVoiceResponseBody body;

    public static PhoneNumberStatusForVoiceResponse build(java.util.Map<String, ?> map) throws Exception {
        PhoneNumberStatusForVoiceResponse self = new PhoneNumberStatusForVoiceResponse();
        return TeaModel.build(map, self);
    }

    public PhoneNumberStatusForVoiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PhoneNumberStatusForVoiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PhoneNumberStatusForVoiceResponse setBody(PhoneNumberStatusForVoiceResponseBody body) {
        this.body = body;
        return this;
    }
    public PhoneNumberStatusForVoiceResponseBody getBody() {
        return this.body;
    }

}

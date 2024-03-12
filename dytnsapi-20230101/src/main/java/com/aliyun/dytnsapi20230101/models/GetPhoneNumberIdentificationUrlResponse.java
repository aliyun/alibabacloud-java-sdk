// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20230101.models;

import com.aliyun.tea.*;

public class GetPhoneNumberIdentificationUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPhoneNumberIdentificationUrlResponseBody body;

    public static GetPhoneNumberIdentificationUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPhoneNumberIdentificationUrlResponse self = new GetPhoneNumberIdentificationUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetPhoneNumberIdentificationUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPhoneNumberIdentificationUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPhoneNumberIdentificationUrlResponse setBody(GetPhoneNumberIdentificationUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPhoneNumberIdentificationUrlResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20230101.models;

import com.aliyun.tea.*;

public class GetPhoneNumberIdentificationResultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetPhoneNumberIdentificationResultResponseBody body;

    public static GetPhoneNumberIdentificationResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPhoneNumberIdentificationResultResponse self = new GetPhoneNumberIdentificationResultResponse();
        return TeaModel.build(map, self);
    }

    public GetPhoneNumberIdentificationResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPhoneNumberIdentificationResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPhoneNumberIdentificationResultResponse setBody(GetPhoneNumberIdentificationResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPhoneNumberIdentificationResultResponseBody getBody() {
        return this.body;
    }

}

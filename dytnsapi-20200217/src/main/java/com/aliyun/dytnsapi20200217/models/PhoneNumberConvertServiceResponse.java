// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class PhoneNumberConvertServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PhoneNumberConvertServiceResponseBody body;

    public static PhoneNumberConvertServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        PhoneNumberConvertServiceResponse self = new PhoneNumberConvertServiceResponse();
        return TeaModel.build(map, self);
    }

    public PhoneNumberConvertServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PhoneNumberConvertServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PhoneNumberConvertServiceResponse setBody(PhoneNumberConvertServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public PhoneNumberConvertServiceResponseBody getBody() {
        return this.body;
    }

}

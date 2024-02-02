// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class InvalidPhoneNumberFilterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InvalidPhoneNumberFilterResponseBody body;

    public static InvalidPhoneNumberFilterResponse build(java.util.Map<String, ?> map) throws Exception {
        InvalidPhoneNumberFilterResponse self = new InvalidPhoneNumberFilterResponse();
        return TeaModel.build(map, self);
    }

    public InvalidPhoneNumberFilterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InvalidPhoneNumberFilterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InvalidPhoneNumberFilterResponse setBody(InvalidPhoneNumberFilterResponseBody body) {
        this.body = body;
        return this;
    }
    public InvalidPhoneNumberFilterResponseBody getBody() {
        return this.body;
    }

}

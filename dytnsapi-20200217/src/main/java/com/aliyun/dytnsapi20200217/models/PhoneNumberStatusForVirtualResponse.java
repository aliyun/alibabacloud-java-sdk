// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class PhoneNumberStatusForVirtualResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PhoneNumberStatusForVirtualResponseBody body;

    public static PhoneNumberStatusForVirtualResponse build(java.util.Map<String, ?> map) throws Exception {
        PhoneNumberStatusForVirtualResponse self = new PhoneNumberStatusForVirtualResponse();
        return TeaModel.build(map, self);
    }

    public PhoneNumberStatusForVirtualResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PhoneNumberStatusForVirtualResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PhoneNumberStatusForVirtualResponse setBody(PhoneNumberStatusForVirtualResponseBody body) {
        this.body = body;
        return this;
    }
    public PhoneNumberStatusForVirtualResponseBody getBody() {
        return this.body;
    }

}

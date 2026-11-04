// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class RemovePhoneNumberResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemovePhoneNumberResponseBody body;

    public static RemovePhoneNumberResponse build(java.util.Map<String, ?> map) throws Exception {
        RemovePhoneNumberResponse self = new RemovePhoneNumberResponse();
        return TeaModel.build(map, self);
    }

    public RemovePhoneNumberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemovePhoneNumberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemovePhoneNumberResponse setBody(RemovePhoneNumberResponseBody body) {
        this.body = body;
        return this;
    }
    public RemovePhoneNumberResponseBody getBody() {
        return this.body;
    }

}

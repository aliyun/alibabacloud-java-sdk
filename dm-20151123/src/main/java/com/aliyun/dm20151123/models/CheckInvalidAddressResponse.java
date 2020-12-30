// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class CheckInvalidAddressResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckInvalidAddressResponseBody body;

    public static CheckInvalidAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckInvalidAddressResponse self = new CheckInvalidAddressResponse();
        return TeaModel.build(map, self);
    }

    public CheckInvalidAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckInvalidAddressResponse setBody(CheckInvalidAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckInvalidAddressResponseBody getBody() {
        return this.body;
    }

}

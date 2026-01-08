// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class AddAddressRecoverSuspendResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddAddressRecoverSuspendResponseBody body;

    public static AddAddressRecoverSuspendResponse build(java.util.Map<String, ?> map) throws Exception {
        AddAddressRecoverSuspendResponse self = new AddAddressRecoverSuspendResponse();
        return TeaModel.build(map, self);
    }

    public AddAddressRecoverSuspendResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddAddressRecoverSuspendResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddAddressRecoverSuspendResponse setBody(AddAddressRecoverSuspendResponseBody body) {
        this.body = body;
        return this;
    }
    public AddAddressRecoverSuspendResponseBody getBody() {
        return this.body;
    }

}

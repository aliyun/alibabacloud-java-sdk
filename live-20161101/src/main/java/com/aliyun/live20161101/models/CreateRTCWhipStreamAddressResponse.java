// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CreateRTCWhipStreamAddressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateRTCWhipStreamAddressResponseBody body;

    public static CreateRTCWhipStreamAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRTCWhipStreamAddressResponse self = new CreateRTCWhipStreamAddressResponse();
        return TeaModel.build(map, self);
    }

    public CreateRTCWhipStreamAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRTCWhipStreamAddressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRTCWhipStreamAddressResponse setBody(CreateRTCWhipStreamAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRTCWhipStreamAddressResponseBody getBody() {
        return this.body;
    }

}

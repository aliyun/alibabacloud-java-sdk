// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class CreateMailAddressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMailAddressResponseBody body;

    public static CreateMailAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMailAddressResponse self = new CreateMailAddressResponse();
        return TeaModel.build(map, self);
    }

    public CreateMailAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMailAddressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMailAddressResponse setBody(CreateMailAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMailAddressResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class CreateMailAddressResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CreateMailAddressResponse setBody(CreateMailAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMailAddressResponseBody getBody() {
        return this.body;
    }

}

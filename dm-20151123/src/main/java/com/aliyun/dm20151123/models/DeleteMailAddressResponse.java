// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class DeleteMailAddressResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteMailAddressResponseBody body;

    public static DeleteMailAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMailAddressResponse self = new DeleteMailAddressResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMailAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMailAddressResponse setBody(DeleteMailAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMailAddressResponseBody getBody() {
        return this.body;
    }

}

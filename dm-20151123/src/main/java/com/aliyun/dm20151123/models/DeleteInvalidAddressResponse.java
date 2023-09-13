// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class DeleteInvalidAddressResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteInvalidAddressResponseBody body;

    public static DeleteInvalidAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteInvalidAddressResponse self = new DeleteInvalidAddressResponse();
        return TeaModel.build(map, self);
    }

    public DeleteInvalidAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteInvalidAddressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteInvalidAddressResponse setBody(DeleteInvalidAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteInvalidAddressResponseBody getBody() {
        return this.body;
    }

}

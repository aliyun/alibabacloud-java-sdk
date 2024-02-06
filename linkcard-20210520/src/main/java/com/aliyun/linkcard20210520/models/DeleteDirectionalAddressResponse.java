// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkcard20210520.models;

import com.aliyun.tea.*;

public class DeleteDirectionalAddressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDirectionalAddressResponseBody body;

    public static DeleteDirectionalAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDirectionalAddressResponse self = new DeleteDirectionalAddressResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDirectionalAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDirectionalAddressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDirectionalAddressResponse setBody(DeleteDirectionalAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDirectionalAddressResponseBody getBody() {
        return this.body;
    }

}

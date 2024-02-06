// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkcard20210520.models;

import com.aliyun.tea.*;

public class AddDirectionalAddressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddDirectionalAddressResponseBody body;

    public static AddDirectionalAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        AddDirectionalAddressResponse self = new AddDirectionalAddressResponse();
        return TeaModel.build(map, self);
    }

    public AddDirectionalAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddDirectionalAddressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddDirectionalAddressResponse setBody(AddDirectionalAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public AddDirectionalAddressResponseBody getBody() {
        return this.body;
    }

}

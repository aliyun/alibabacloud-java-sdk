// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class AddAddressBookResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddAddressBookResponseBody body;

    public static AddAddressBookResponse build(java.util.Map<String, ?> map) throws Exception {
        AddAddressBookResponse self = new AddAddressBookResponse();
        return TeaModel.build(map, self);
    }

    public AddAddressBookResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddAddressBookResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddAddressBookResponse setBody(AddAddressBookResponseBody body) {
        this.body = body;
        return this;
    }
    public AddAddressBookResponseBody getBody() {
        return this.body;
    }

}

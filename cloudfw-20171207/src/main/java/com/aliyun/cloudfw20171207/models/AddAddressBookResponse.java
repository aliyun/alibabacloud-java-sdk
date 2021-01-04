// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class AddAddressBookResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public AddAddressBookResponse setBody(AddAddressBookResponseBody body) {
        this.body = body;
        return this;
    }
    public AddAddressBookResponseBody getBody() {
        return this.body;
    }

}

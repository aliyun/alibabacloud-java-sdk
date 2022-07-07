// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DeleteAddressBookResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteAddressBookResponseBody body;

    public static DeleteAddressBookResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAddressBookResponse self = new DeleteAddressBookResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAddressBookResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAddressBookResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAddressBookResponse setBody(DeleteAddressBookResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAddressBookResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class AddContactsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddContactsResponseBody body;

    public static AddContactsResponse build(java.util.Map<String, ?> map) throws Exception {
        AddContactsResponse self = new AddContactsResponse();
        return TeaModel.build(map, self);
    }

    public AddContactsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddContactsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddContactsResponse setBody(AddContactsResponseBody body) {
        this.body = body;
        return this;
    }
    public AddContactsResponseBody getBody() {
        return this.body;
    }

}

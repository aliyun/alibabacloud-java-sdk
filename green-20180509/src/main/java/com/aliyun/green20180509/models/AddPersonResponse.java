// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class AddPersonResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddPersonResponseBody body;

    public static AddPersonResponse build(java.util.Map<String, ?> map) throws Exception {
        AddPersonResponse self = new AddPersonResponse();
        return TeaModel.build(map, self);
    }

    public AddPersonResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddPersonResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddPersonResponse setBody(AddPersonResponseBody body) {
        this.body = body;
        return this;
    }
    public AddPersonResponseBody getBody() {
        return this.body;
    }

}

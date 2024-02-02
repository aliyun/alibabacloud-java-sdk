// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class AddPersonalNumbersToUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddPersonalNumbersToUserResponseBody body;

    public static AddPersonalNumbersToUserResponse build(java.util.Map<String, ?> map) throws Exception {
        AddPersonalNumbersToUserResponse self = new AddPersonalNumbersToUserResponse();
        return TeaModel.build(map, self);
    }

    public AddPersonalNumbersToUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddPersonalNumbersToUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddPersonalNumbersToUserResponse setBody(AddPersonalNumbersToUserResponseBody body) {
        this.body = body;
        return this;
    }
    public AddPersonalNumbersToUserResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class AddUserBusinessFormResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddUserBusinessFormResponseBody body;

    public static AddUserBusinessFormResponse build(java.util.Map<String, ?> map) throws Exception {
        AddUserBusinessFormResponse self = new AddUserBusinessFormResponse();
        return TeaModel.build(map, self);
    }

    public AddUserBusinessFormResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddUserBusinessFormResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddUserBusinessFormResponse setBody(AddUserBusinessFormResponseBody body) {
        this.body = body;
        return this;
    }
    public AddUserBusinessFormResponseBody getBody() {
        return this.body;
    }

}

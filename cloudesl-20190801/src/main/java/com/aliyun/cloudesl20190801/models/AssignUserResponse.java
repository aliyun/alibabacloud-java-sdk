// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20190801.models;

import com.aliyun.tea.*;

public class AssignUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AssignUserResponseBody body;

    public static AssignUserResponse build(java.util.Map<String, ?> map) throws Exception {
        AssignUserResponse self = new AssignUserResponse();
        return TeaModel.build(map, self);
    }

    public AssignUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssignUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AssignUserResponse setBody(AssignUserResponseBody body) {
        this.body = body;
        return this;
    }
    public AssignUserResponseBody getBody() {
        return this.body;
    }

}

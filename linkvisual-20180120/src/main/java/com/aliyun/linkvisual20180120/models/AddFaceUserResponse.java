// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class AddFaceUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddFaceUserResponseBody body;

    public static AddFaceUserResponse build(java.util.Map<String, ?> map) throws Exception {
        AddFaceUserResponse self = new AddFaceUserResponse();
        return TeaModel.build(map, self);
    }

    public AddFaceUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddFaceUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddFaceUserResponse setBody(AddFaceUserResponseBody body) {
        this.body = body;
        return this;
    }
    public AddFaceUserResponseBody getBody() {
        return this.body;
    }

}

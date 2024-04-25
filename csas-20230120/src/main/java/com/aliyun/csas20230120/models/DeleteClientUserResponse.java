// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class DeleteClientUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteClientUserResponseBody body;

    public static DeleteClientUserResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteClientUserResponse self = new DeleteClientUserResponse();
        return TeaModel.build(map, self);
    }

    public DeleteClientUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteClientUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteClientUserResponse setBody(DeleteClientUserResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteClientUserResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class DeleteFaceUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteFaceUserResponseBody body;

    public static DeleteFaceUserResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteFaceUserResponse self = new DeleteFaceUserResponse();
        return TeaModel.build(map, self);
    }

    public DeleteFaceUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteFaceUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteFaceUserResponse setBody(DeleteFaceUserResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteFaceUserResponseBody getBody() {
        return this.body;
    }

}

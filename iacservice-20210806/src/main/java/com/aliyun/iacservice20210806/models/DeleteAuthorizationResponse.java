// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class DeleteAuthorizationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAuthorizationResponseBody body;

    public static DeleteAuthorizationResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAuthorizationResponse self = new DeleteAuthorizationResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAuthorizationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAuthorizationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAuthorizationResponse setBody(DeleteAuthorizationResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAuthorizationResponseBody getBody() {
        return this.body;
    }

}

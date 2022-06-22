// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class DeleteUserAuthorityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteUserAuthorityResponseBody body;

    public static DeleteUserAuthorityResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserAuthorityResponse self = new DeleteUserAuthorityResponse();
        return TeaModel.build(map, self);
    }

    public DeleteUserAuthorityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteUserAuthorityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteUserAuthorityResponse setBody(DeleteUserAuthorityResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteUserAuthorityResponseBody getBody() {
        return this.body;
    }

}

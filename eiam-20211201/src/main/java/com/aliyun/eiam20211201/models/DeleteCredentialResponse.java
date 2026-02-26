// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DeleteCredentialResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCredentialResponseBody body;

    public static DeleteCredentialResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCredentialResponse self = new DeleteCredentialResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCredentialResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCredentialResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCredentialResponse setBody(DeleteCredentialResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCredentialResponseBody getBody() {
        return this.body;
    }

}

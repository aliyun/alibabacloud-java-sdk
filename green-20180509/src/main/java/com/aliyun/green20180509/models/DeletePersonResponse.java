// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20180509.models;

import com.aliyun.tea.*;

public class DeletePersonResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeletePersonResponseBody body;

    public static DeletePersonResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePersonResponse self = new DeletePersonResponse();
        return TeaModel.build(map, self);
    }

    public DeletePersonResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePersonResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePersonResponse setBody(DeletePersonResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePersonResponseBody getBody() {
        return this.body;
    }

}

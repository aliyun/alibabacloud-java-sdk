// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DeleteApplicationTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteApplicationTokenResponseBody body;

    public static DeleteApplicationTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteApplicationTokenResponse self = new DeleteApplicationTokenResponse();
        return TeaModel.build(map, self);
    }

    public DeleteApplicationTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteApplicationTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteApplicationTokenResponse setBody(DeleteApplicationTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteApplicationTokenResponseBody getBody() {
        return this.body;
    }

}

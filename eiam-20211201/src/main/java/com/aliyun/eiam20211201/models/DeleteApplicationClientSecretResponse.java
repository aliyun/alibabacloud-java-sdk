// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DeleteApplicationClientSecretResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteApplicationClientSecretResponseBody body;

    public static DeleteApplicationClientSecretResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteApplicationClientSecretResponse self = new DeleteApplicationClientSecretResponse();
        return TeaModel.build(map, self);
    }

    public DeleteApplicationClientSecretResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteApplicationClientSecretResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteApplicationClientSecretResponse setBody(DeleteApplicationClientSecretResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteApplicationClientSecretResponseBody getBody() {
        return this.body;
    }

}

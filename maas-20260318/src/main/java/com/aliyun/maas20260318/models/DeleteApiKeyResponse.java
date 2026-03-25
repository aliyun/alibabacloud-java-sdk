// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maas20260318.models;

import com.aliyun.tea.*;

public class DeleteApiKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteApiKeyResponseBody body;

    public static DeleteApiKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteApiKeyResponse self = new DeleteApiKeyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteApiKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteApiKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteApiKeyResponse setBody(DeleteApiKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteApiKeyResponseBody getBody() {
        return this.body;
    }

}

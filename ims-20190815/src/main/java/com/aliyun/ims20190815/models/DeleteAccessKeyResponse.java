// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class DeleteAccessKeyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteAccessKeyResponseBody body;

    public static DeleteAccessKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAccessKeyResponse self = new DeleteAccessKeyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAccessKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAccessKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAccessKeyResponse setBody(DeleteAccessKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAccessKeyResponseBody getBody() {
        return this.body;
    }

}

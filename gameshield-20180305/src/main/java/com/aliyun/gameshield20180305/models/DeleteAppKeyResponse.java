// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305.models;

import com.aliyun.tea.*;

public class DeleteAppKeyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteAppKeyResponseBody body;

    public static DeleteAppKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppKeyResponse self = new DeleteAppKeyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAppKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAppKeyResponse setBody(DeleteAppKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAppKeyResponseBody getBody() {
        return this.body;
    }

}

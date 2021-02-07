// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class DeleteSecretBlacklistResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteSecretBlacklistResponseBody body;

    public static DeleteSecretBlacklistResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSecretBlacklistResponse self = new DeleteSecretBlacklistResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSecretBlacklistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSecretBlacklistResponse setBody(DeleteSecretBlacklistResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSecretBlacklistResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aas20150701.models;

import com.aliyun.tea.*;

public class DeleteAccessKeyForAccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteAccessKeyForAccountResponseBody body;

    public static DeleteAccessKeyForAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAccessKeyForAccountResponse self = new DeleteAccessKeyForAccountResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAccessKeyForAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAccessKeyForAccountResponse setBody(DeleteAccessKeyForAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAccessKeyForAccountResponseBody getBody() {
        return this.body;
    }

}

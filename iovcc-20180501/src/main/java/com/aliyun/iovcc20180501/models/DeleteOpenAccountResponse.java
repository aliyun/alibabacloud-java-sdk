// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DeleteOpenAccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteOpenAccountResponseBody body;

    public static DeleteOpenAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteOpenAccountResponse self = new DeleteOpenAccountResponse();
        return TeaModel.build(map, self);
    }

    public DeleteOpenAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteOpenAccountResponse setBody(DeleteOpenAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteOpenAccountResponseBody getBody() {
        return this.body;
    }

}

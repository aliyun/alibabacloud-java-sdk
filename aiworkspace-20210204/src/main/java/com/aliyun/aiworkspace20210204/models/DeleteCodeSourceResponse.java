// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class DeleteCodeSourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteCodeSourceResponseBody body;

    public static DeleteCodeSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCodeSourceResponse self = new DeleteCodeSourceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCodeSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCodeSourceResponse setBody(DeleteCodeSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCodeSourceResponseBody getBody() {
        return this.body;
    }

}

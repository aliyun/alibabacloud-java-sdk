// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteCasterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteCasterResponseBody body;

    public static DeleteCasterResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCasterResponse self = new DeleteCasterResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCasterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCasterResponse setBody(DeleteCasterResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCasterResponseBody getBody() {
        return this.body;
    }

}

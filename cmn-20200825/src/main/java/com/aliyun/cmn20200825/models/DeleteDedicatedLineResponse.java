// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class DeleteDedicatedLineResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDedicatedLineResponseBody body;

    public static DeleteDedicatedLineResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDedicatedLineResponse self = new DeleteDedicatedLineResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDedicatedLineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDedicatedLineResponse setBody(DeleteDedicatedLineResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDedicatedLineResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class DeleteDiversifyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDiversifyResponseBody body;

    public static DeleteDiversifyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDiversifyResponse self = new DeleteDiversifyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDiversifyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDiversifyResponse setBody(DeleteDiversifyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDiversifyResponseBody getBody() {
        return this.body;
    }

}

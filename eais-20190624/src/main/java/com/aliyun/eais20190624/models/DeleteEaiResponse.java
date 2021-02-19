// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eais20190624.models;

import com.aliyun.tea.*;

public class DeleteEaiResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteEaiResponseBody body;

    public static DeleteEaiResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEaiResponse self = new DeleteEaiResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEaiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEaiResponse setBody(DeleteEaiResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEaiResponseBody getBody() {
        return this.body;
    }

}

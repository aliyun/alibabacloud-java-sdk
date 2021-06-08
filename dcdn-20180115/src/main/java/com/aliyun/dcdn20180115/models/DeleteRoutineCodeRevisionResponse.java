// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DeleteRoutineCodeRevisionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteRoutineCodeRevisionResponseBody body;

    public static DeleteRoutineCodeRevisionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRoutineCodeRevisionResponse self = new DeleteRoutineCodeRevisionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRoutineCodeRevisionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRoutineCodeRevisionResponse setBody(DeleteRoutineCodeRevisionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRoutineCodeRevisionResponseBody getBody() {
        return this.body;
    }

}

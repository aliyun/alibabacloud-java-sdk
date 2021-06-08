// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DeleteRoutineResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteRoutineResponseBody body;

    public static DeleteRoutineResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRoutineResponse self = new DeleteRoutineResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRoutineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRoutineResponse setBody(DeleteRoutineResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRoutineResponseBody getBody() {
        return this.body;
    }

}

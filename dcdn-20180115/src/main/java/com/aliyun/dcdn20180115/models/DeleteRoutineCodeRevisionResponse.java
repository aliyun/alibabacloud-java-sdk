// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DeleteRoutineCodeRevisionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DeleteRoutineCodeRevisionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRoutineCodeRevisionResponse setBody(DeleteRoutineCodeRevisionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRoutineCodeRevisionResponseBody getBody() {
        return this.body;
    }

}

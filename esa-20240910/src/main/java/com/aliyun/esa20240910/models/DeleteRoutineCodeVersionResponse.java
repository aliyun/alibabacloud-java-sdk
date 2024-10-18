// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteRoutineCodeVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteRoutineCodeVersionResponseBody body;

    public static DeleteRoutineCodeVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRoutineCodeVersionResponse self = new DeleteRoutineCodeVersionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRoutineCodeVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRoutineCodeVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRoutineCodeVersionResponse setBody(DeleteRoutineCodeVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRoutineCodeVersionResponseBody getBody() {
        return this.body;
    }

}

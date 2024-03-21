// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DeleteRoutineConfEnvsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteRoutineConfEnvsResponseBody body;

    public static DeleteRoutineConfEnvsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRoutineConfEnvsResponse self = new DeleteRoutineConfEnvsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRoutineConfEnvsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRoutineConfEnvsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRoutineConfEnvsResponse setBody(DeleteRoutineConfEnvsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRoutineConfEnvsResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateRoutineRelatedRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateRoutineRelatedRecordResponseBody body;

    public static CreateRoutineRelatedRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRoutineRelatedRecordResponse self = new CreateRoutineRelatedRecordResponse();
        return TeaModel.build(map, self);
    }

    public CreateRoutineRelatedRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRoutineRelatedRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRoutineRelatedRecordResponse setBody(CreateRoutineRelatedRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRoutineRelatedRecordResponseBody getBody() {
        return this.body;
    }

}

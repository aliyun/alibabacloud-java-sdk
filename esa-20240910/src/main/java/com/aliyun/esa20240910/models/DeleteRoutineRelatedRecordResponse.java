// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteRoutineRelatedRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteRoutineRelatedRecordResponseBody body;

    public static DeleteRoutineRelatedRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRoutineRelatedRecordResponse self = new DeleteRoutineRelatedRecordResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRoutineRelatedRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRoutineRelatedRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRoutineRelatedRecordResponse setBody(DeleteRoutineRelatedRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRoutineRelatedRecordResponseBody getBody() {
        return this.body;
    }

}

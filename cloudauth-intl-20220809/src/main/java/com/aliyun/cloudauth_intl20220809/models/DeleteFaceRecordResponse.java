// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class DeleteFaceRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteFaceRecordResponseBody body;

    public static DeleteFaceRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteFaceRecordResponse self = new DeleteFaceRecordResponse();
        return TeaModel.build(map, self);
    }

    public DeleteFaceRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteFaceRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteFaceRecordResponse setBody(DeleteFaceRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteFaceRecordResponseBody getBody() {
        return this.body;
    }

}

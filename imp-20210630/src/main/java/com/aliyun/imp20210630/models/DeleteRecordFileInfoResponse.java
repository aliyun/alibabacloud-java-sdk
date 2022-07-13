// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class DeleteRecordFileInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteRecordFileInfoResponseBody body;

    public static DeleteRecordFileInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRecordFileInfoResponse self = new DeleteRecordFileInfoResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRecordFileInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRecordFileInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRecordFileInfoResponse setBody(DeleteRecordFileInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRecordFileInfoResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class DeleteRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteRecordResponseBody body;

    public static DeleteRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRecordResponse self = new DeleteRecordResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRecordResponse setBody(DeleteRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRecordResponseBody getBody() {
        return this.body;
    }

}

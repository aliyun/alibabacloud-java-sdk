// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DeleteRecursionRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteRecursionRecordResponseBody body;

    public static DeleteRecursionRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRecursionRecordResponse self = new DeleteRecursionRecordResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRecursionRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRecursionRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRecursionRecordResponse setBody(DeleteRecursionRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRecursionRecordResponseBody getBody() {
        return this.body;
    }

}

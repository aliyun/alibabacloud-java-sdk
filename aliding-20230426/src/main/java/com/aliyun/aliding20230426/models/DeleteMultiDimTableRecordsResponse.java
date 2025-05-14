// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class DeleteMultiDimTableRecordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteMultiDimTableRecordsResponseBody body;

    public static DeleteMultiDimTableRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMultiDimTableRecordsResponse self = new DeleteMultiDimTableRecordsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMultiDimTableRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMultiDimTableRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMultiDimTableRecordsResponse setBody(DeleteMultiDimTableRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMultiDimTableRecordsResponseBody getBody() {
        return this.body;
    }

}

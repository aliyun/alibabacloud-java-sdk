// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class InsertMultiDimTableRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InsertMultiDimTableRecordResponseBody body;

    public static InsertMultiDimTableRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        InsertMultiDimTableRecordResponse self = new InsertMultiDimTableRecordResponse();
        return TeaModel.build(map, self);
    }

    public InsertMultiDimTableRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InsertMultiDimTableRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InsertMultiDimTableRecordResponse setBody(InsertMultiDimTableRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public InsertMultiDimTableRecordResponseBody getBody() {
        return this.body;
    }

}

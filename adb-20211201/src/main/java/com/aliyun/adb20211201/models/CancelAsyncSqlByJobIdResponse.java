// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class CancelAsyncSqlByJobIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CancelAsyncSqlByJobIdResponseBody body;

    public static CancelAsyncSqlByJobIdResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelAsyncSqlByJobIdResponse self = new CancelAsyncSqlByJobIdResponse();
        return TeaModel.build(map, self);
    }

    public CancelAsyncSqlByJobIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelAsyncSqlByJobIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelAsyncSqlByJobIdResponse setBody(CancelAsyncSqlByJobIdResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelAsyncSqlByJobIdResponseBody getBody() {
        return this.body;
    }

}

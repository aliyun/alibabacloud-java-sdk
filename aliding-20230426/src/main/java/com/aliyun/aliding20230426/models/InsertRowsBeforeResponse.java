// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class InsertRowsBeforeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public InsertRowsBeforeResponseBody body;

    public static InsertRowsBeforeResponse build(java.util.Map<String, ?> map) throws Exception {
        InsertRowsBeforeResponse self = new InsertRowsBeforeResponse();
        return TeaModel.build(map, self);
    }

    public InsertRowsBeforeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InsertRowsBeforeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InsertRowsBeforeResponse setBody(InsertRowsBeforeResponseBody body) {
        this.body = body;
        return this;
    }
    public InsertRowsBeforeResponseBody getBody() {
        return this.body;
    }

}

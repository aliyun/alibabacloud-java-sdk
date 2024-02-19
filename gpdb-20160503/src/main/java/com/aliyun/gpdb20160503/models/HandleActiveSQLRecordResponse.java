// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class HandleActiveSQLRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public HandleActiveSQLRecordResponseBody body;

    public static HandleActiveSQLRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        HandleActiveSQLRecordResponse self = new HandleActiveSQLRecordResponse();
        return TeaModel.build(map, self);
    }

    public HandleActiveSQLRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public HandleActiveSQLRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public HandleActiveSQLRecordResponse setBody(HandleActiveSQLRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public HandleActiveSQLRecordResponseBody getBody() {
        return this.body;
    }

}

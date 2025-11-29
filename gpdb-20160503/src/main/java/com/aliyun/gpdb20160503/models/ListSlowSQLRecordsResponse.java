// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ListSlowSQLRecordsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSlowSQLRecordsResponseBody body;

    public static ListSlowSQLRecordsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSlowSQLRecordsResponse self = new ListSlowSQLRecordsResponse();
        return TeaModel.build(map, self);
    }

    public ListSlowSQLRecordsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSlowSQLRecordsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSlowSQLRecordsResponse setBody(ListSlowSQLRecordsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSlowSQLRecordsResponseBody getBody() {
        return this.body;
    }

}

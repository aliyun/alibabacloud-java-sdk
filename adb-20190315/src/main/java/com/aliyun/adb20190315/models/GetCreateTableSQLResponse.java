// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class GetCreateTableSQLResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCreateTableSQLResponseBody body;

    public static GetCreateTableSQLResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCreateTableSQLResponse self = new GetCreateTableSQLResponse();
        return TeaModel.build(map, self);
    }

    public GetCreateTableSQLResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCreateTableSQLResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCreateTableSQLResponse setBody(GetCreateTableSQLResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCreateTableSQLResponseBody getBody() {
        return this.body;
    }

}

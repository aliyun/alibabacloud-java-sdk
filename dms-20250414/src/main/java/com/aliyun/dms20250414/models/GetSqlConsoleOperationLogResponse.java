// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class GetSqlConsoleOperationLogResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSqlConsoleOperationLogResponseBody body;

    public static GetSqlConsoleOperationLogResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSqlConsoleOperationLogResponse self = new GetSqlConsoleOperationLogResponse();
        return TeaModel.build(map, self);
    }

    public GetSqlConsoleOperationLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSqlConsoleOperationLogResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSqlConsoleOperationLogResponse setBody(GetSqlConsoleOperationLogResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSqlConsoleOperationLogResponseBody getBody() {
        return this.body;
    }

}

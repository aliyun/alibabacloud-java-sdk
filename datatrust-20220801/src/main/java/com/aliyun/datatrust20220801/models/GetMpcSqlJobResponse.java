// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class GetMpcSqlJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetMpcSqlJobResponseBody body;

    public static GetMpcSqlJobResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMpcSqlJobResponse self = new GetMpcSqlJobResponse();
        return TeaModel.build(map, self);
    }

    public GetMpcSqlJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMpcSqlJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMpcSqlJobResponse setBody(GetMpcSqlJobResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMpcSqlJobResponseBody getBody() {
        return this.body;
    }

}

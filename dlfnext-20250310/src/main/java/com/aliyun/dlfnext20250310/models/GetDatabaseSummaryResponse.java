// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class GetDatabaseSummaryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DatabaseSummary body;

    public static GetDatabaseSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDatabaseSummaryResponse self = new GetDatabaseSummaryResponse();
        return TeaModel.build(map, self);
    }

    public GetDatabaseSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDatabaseSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDatabaseSummaryResponse setBody(DatabaseSummary body) {
        this.body = body;
        return this;
    }
    public DatabaseSummary getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMigrationSummaryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMigrationSummaryResponseBody body;

    public static GetMigrationSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMigrationSummaryResponse self = new GetMigrationSummaryResponse();
        return TeaModel.build(map, self);
    }

    public GetMigrationSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMigrationSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMigrationSummaryResponse setBody(GetMigrationSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMigrationSummaryResponseBody getBody() {
        return this.body;
    }

}

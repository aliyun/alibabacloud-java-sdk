// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMigrationSummaryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetMigrationSummaryResponse setBody(GetMigrationSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMigrationSummaryResponseBody getBody() {
        return this.body;
    }

}

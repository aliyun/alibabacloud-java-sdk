// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class GetSupabaseProjectDashboardAccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSupabaseProjectDashboardAccountResponseBody body;

    public static GetSupabaseProjectDashboardAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSupabaseProjectDashboardAccountResponse self = new GetSupabaseProjectDashboardAccountResponse();
        return TeaModel.build(map, self);
    }

    public GetSupabaseProjectDashboardAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSupabaseProjectDashboardAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSupabaseProjectDashboardAccountResponse setBody(GetSupabaseProjectDashboardAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSupabaseProjectDashboardAccountResponseBody getBody() {
        return this.body;
    }

}

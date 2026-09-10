// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class GetBwmMigrationSubmitInstanceListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetBwmMigrationSubmitInstanceListResponseBody body;

    public static GetBwmMigrationSubmitInstanceListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBwmMigrationSubmitInstanceListResponse self = new GetBwmMigrationSubmitInstanceListResponse();
        return TeaModel.build(map, self);
    }

    public GetBwmMigrationSubmitInstanceListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBwmMigrationSubmitInstanceListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBwmMigrationSubmitInstanceListResponse setBody(GetBwmMigrationSubmitInstanceListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBwmMigrationSubmitInstanceListResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lhm20250116.models;

import com.aliyun.tea.*;

public class GetBwmMigrationTaskWriterResultPackageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetBwmMigrationTaskWriterResultPackageResponseBody body;

    public static GetBwmMigrationTaskWriterResultPackageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBwmMigrationTaskWriterResultPackageResponse self = new GetBwmMigrationTaskWriterResultPackageResponse();
        return TeaModel.build(map, self);
    }

    public GetBwmMigrationTaskWriterResultPackageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBwmMigrationTaskWriterResultPackageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBwmMigrationTaskWriterResultPackageResponse setBody(GetBwmMigrationTaskWriterResultPackageResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBwmMigrationTaskWriterResultPackageResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetMigrationNamespacedServicesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMigrationNamespacedServicesResponseBody body;

    public static GetMigrationNamespacedServicesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMigrationNamespacedServicesResponse self = new GetMigrationNamespacedServicesResponse();
        return TeaModel.build(map, self);
    }

    public GetMigrationNamespacedServicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMigrationNamespacedServicesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMigrationNamespacedServicesResponse setBody(GetMigrationNamespacedServicesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMigrationNamespacedServicesResponseBody getBody() {
        return this.body;
    }

}

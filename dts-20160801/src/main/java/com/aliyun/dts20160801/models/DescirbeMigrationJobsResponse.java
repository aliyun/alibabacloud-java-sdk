// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20160801.models;

import com.aliyun.tea.*;

public class DescirbeMigrationJobsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescirbeMigrationJobsResponseBody body;

    public static DescirbeMigrationJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescirbeMigrationJobsResponse self = new DescirbeMigrationJobsResponse();
        return TeaModel.build(map, self);
    }

    public DescirbeMigrationJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescirbeMigrationJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescirbeMigrationJobsResponse setBody(DescirbeMigrationJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescirbeMigrationJobsResponseBody getBody() {
        return this.body;
    }

}

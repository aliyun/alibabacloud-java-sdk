// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeMigrationPreferencesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeMigrationPreferencesResponseBody body;

    public static DescribeMigrationPreferencesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMigrationPreferencesResponse self = new DescribeMigrationPreferencesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMigrationPreferencesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMigrationPreferencesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMigrationPreferencesResponse setBody(DescribeMigrationPreferencesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMigrationPreferencesResponseBody getBody() {
        return this.body;
    }

}

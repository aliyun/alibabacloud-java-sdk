// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeMigrationPlansResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeMigrationPlansResponseBody body;

    public static DescribeMigrationPlansResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMigrationPlansResponse self = new DescribeMigrationPlansResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMigrationPlansResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMigrationPlansResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMigrationPlansResponse setBody(DescribeMigrationPlansResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMigrationPlansResponseBody getBody() {
        return this.body;
    }

}

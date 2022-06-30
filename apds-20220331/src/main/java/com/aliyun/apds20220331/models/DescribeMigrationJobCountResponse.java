// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apds20220331.models;

import com.aliyun.tea.*;

public class DescribeMigrationJobCountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeMigrationJobCountResponseBody body;

    public static DescribeMigrationJobCountResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMigrationJobCountResponse self = new DescribeMigrationJobCountResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMigrationJobCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMigrationJobCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMigrationJobCountResponse setBody(DescribeMigrationJobCountResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMigrationJobCountResponseBody getBody() {
        return this.body;
    }

}

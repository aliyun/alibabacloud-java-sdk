// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apds20220331.models;

import com.aliyun.tea.*;

public class DescribeMigrationJobConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeMigrationJobConfigResponseBody body;

    public static DescribeMigrationJobConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMigrationJobConfigResponse self = new DescribeMigrationJobConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMigrationJobConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMigrationJobConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMigrationJobConfigResponse setBody(DescribeMigrationJobConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMigrationJobConfigResponseBody getBody() {
        return this.body;
    }

}

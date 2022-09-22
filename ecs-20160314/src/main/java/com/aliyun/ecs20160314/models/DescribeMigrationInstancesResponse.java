// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeMigrationInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeMigrationInstancesResponseBody body;

    public static DescribeMigrationInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMigrationInstancesResponse self = new DescribeMigrationInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMigrationInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMigrationInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMigrationInstancesResponse setBody(DescribeMigrationInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMigrationInstancesResponseBody getBody() {
        return this.body;
    }

}

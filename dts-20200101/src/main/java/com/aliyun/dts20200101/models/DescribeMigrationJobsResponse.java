// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeMigrationJobsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMigrationJobsResponseBody body;

    public static DescribeMigrationJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMigrationJobsResponse self = new DescribeMigrationJobsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMigrationJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMigrationJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMigrationJobsResponse setBody(DescribeMigrationJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMigrationJobsResponseBody getBody() {
        return this.body;
    }

}

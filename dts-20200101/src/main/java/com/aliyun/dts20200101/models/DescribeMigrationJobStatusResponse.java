// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeMigrationJobStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMigrationJobStatusResponseBody body;

    public static DescribeMigrationJobStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMigrationJobStatusResponse self = new DescribeMigrationJobStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMigrationJobStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMigrationJobStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMigrationJobStatusResponse setBody(DescribeMigrationJobStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMigrationJobStatusResponseBody getBody() {
        return this.body;
    }

}

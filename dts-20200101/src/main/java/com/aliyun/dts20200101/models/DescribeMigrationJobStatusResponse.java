// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeMigrationJobStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeMigrationJobStatusResponse setBody(DescribeMigrationJobStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMigrationJobStatusResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20160801.models;

import com.aliyun.tea.*;

public class DescribeMigrationJobDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeMigrationJobDetailResponseBody body;

    public static DescribeMigrationJobDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMigrationJobDetailResponse self = new DescribeMigrationJobDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMigrationJobDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMigrationJobDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMigrationJobDetailResponse setBody(DescribeMigrationJobDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMigrationJobDetailResponseBody getBody() {
        return this.body;
    }

}

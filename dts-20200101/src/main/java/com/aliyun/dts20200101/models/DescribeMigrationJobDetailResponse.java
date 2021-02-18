// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DescribeMigrationJobDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

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

    public DescribeMigrationJobDetailResponse setBody(DescribeMigrationJobDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMigrationJobDetailResponseBody getBody() {
        return this.body;
    }

}

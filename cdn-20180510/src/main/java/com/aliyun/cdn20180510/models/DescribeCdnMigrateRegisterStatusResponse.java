// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnMigrateRegisterStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCdnMigrateRegisterStatusResponseBody body;

    public static DescribeCdnMigrateRegisterStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnMigrateRegisterStatusResponse self = new DescribeCdnMigrateRegisterStatusResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCdnMigrateRegisterStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCdnMigrateRegisterStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCdnMigrateRegisterStatusResponse setBody(DescribeCdnMigrateRegisterStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCdnMigrateRegisterStatusResponseBody getBody() {
        return this.body;
    }

}

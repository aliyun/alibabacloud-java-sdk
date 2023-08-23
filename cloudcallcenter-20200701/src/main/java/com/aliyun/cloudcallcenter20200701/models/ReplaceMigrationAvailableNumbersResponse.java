// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcallcenter20200701.models;

import com.aliyun.tea.*;

public class ReplaceMigrationAvailableNumbersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ReplaceMigrationAvailableNumbersResponseBody body;

    public static ReplaceMigrationAvailableNumbersResponse build(java.util.Map<String, ?> map) throws Exception {
        ReplaceMigrationAvailableNumbersResponse self = new ReplaceMigrationAvailableNumbersResponse();
        return TeaModel.build(map, self);
    }

    public ReplaceMigrationAvailableNumbersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReplaceMigrationAvailableNumbersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReplaceMigrationAvailableNumbersResponse setBody(ReplaceMigrationAvailableNumbersResponseBody body) {
        this.body = body;
        return this;
    }
    public ReplaceMigrationAvailableNumbersResponseBody getBody() {
        return this.body;
    }

}

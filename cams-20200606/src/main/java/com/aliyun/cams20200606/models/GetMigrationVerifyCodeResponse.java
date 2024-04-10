// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetMigrationVerifyCodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMigrationVerifyCodeResponseBody body;

    public static GetMigrationVerifyCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMigrationVerifyCodeResponse self = new GetMigrationVerifyCodeResponse();
        return TeaModel.build(map, self);
    }

    public GetMigrationVerifyCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMigrationVerifyCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMigrationVerifyCodeResponse setBody(GetMigrationVerifyCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMigrationVerifyCodeResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class ResetLangfuseUserPasswordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResetLangfuseUserPasswordResponseBody body;

    public static ResetLangfuseUserPasswordResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetLangfuseUserPasswordResponse self = new ResetLangfuseUserPasswordResponse();
        return TeaModel.build(map, self);
    }

    public ResetLangfuseUserPasswordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetLangfuseUserPasswordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResetLangfuseUserPasswordResponse setBody(ResetLangfuseUserPasswordResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetLangfuseUserPasswordResponseBody getBody() {
        return this.body;
    }

}

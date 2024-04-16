// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class ResetAppUserPasswordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResetAppUserPasswordResponseBody body;

    public static ResetAppUserPasswordResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetAppUserPasswordResponse self = new ResetAppUserPasswordResponse();
        return TeaModel.build(map, self);
    }

    public ResetAppUserPasswordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetAppUserPasswordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResetAppUserPasswordResponse setBody(ResetAppUserPasswordResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetAppUserPasswordResponseBody getBody() {
        return this.body;
    }

}

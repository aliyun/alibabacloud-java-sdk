// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20210101.models;

import com.aliyun.tea.*;

public class SupportDBTableRecoveryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SupportDBTableRecoveryResponseBody body;

    public static SupportDBTableRecoveryResponse build(java.util.Map<String, ?> map) throws Exception {
        SupportDBTableRecoveryResponse self = new SupportDBTableRecoveryResponse();
        return TeaModel.build(map, self);
    }

    public SupportDBTableRecoveryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SupportDBTableRecoveryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SupportDBTableRecoveryResponse setBody(SupportDBTableRecoveryResponseBody body) {
        this.body = body;
        return this;
    }
    public SupportDBTableRecoveryResponseBody getBody() {
        return this.body;
    }

}

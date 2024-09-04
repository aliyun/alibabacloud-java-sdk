// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketing_event20210101.models;

import com.aliyun.tea.*;

public class SyncSignInInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SyncSignInInfoResponseBody body;

    public static SyncSignInInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncSignInInfoResponse self = new SyncSignInInfoResponse();
        return TeaModel.build(map, self);
    }

    public SyncSignInInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SyncSignInInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SyncSignInInfoResponse setBody(SyncSignInInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public SyncSignInInfoResponseBody getBody() {
        return this.body;
    }

}

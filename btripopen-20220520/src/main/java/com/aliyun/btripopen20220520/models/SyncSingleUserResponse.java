// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class SyncSingleUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SyncSingleUserResponseBody body;

    public static SyncSingleUserResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncSingleUserResponse self = new SyncSingleUserResponse();
        return TeaModel.build(map, self);
    }

    public SyncSingleUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SyncSingleUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SyncSingleUserResponse setBody(SyncSingleUserResponseBody body) {
        this.body = body;
        return this;
    }
    public SyncSingleUserResponseBody getBody() {
        return this.body;
    }

}

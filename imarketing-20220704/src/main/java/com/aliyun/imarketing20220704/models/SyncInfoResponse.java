// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imarketing20220704.models;

import com.aliyun.tea.*;

public class SyncInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SyncInfoResponseBody body;

    public static SyncInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncInfoResponse self = new SyncInfoResponse();
        return TeaModel.build(map, self);
    }

    public SyncInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SyncInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SyncInfoResponse setBody(SyncInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public SyncInfoResponseBody getBody() {
        return this.body;
    }

}

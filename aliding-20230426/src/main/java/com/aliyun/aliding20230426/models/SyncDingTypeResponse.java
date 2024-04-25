// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class SyncDingTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SyncDingTypeResponseBody body;

    public static SyncDingTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncDingTypeResponse self = new SyncDingTypeResponse();
        return TeaModel.build(map, self);
    }

    public SyncDingTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SyncDingTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SyncDingTypeResponse setBody(SyncDingTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public SyncDingTypeResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hsm20231113.models;

import com.aliyun.tea.*;

public class SyncClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SyncClusterResponseBody body;

    public static SyncClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncClusterResponse self = new SyncClusterResponse();
        return TeaModel.build(map, self);
    }

    public SyncClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SyncClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SyncClusterResponse setBody(SyncClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public SyncClusterResponseBody getBody() {
        return this.body;
    }

}

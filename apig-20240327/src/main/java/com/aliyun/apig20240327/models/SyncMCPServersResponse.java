// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class SyncMCPServersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SyncMCPServersResponseBody body;

    public static SyncMCPServersResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncMCPServersResponse self = new SyncMCPServersResponse();
        return TeaModel.build(map, self);
    }

    public SyncMCPServersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SyncMCPServersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SyncMCPServersResponse setBody(SyncMCPServersResponseBody body) {
        this.body = body;
        return this;
    }
    public SyncMCPServersResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class SyncMiniGameOnlineStatusByAppResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SyncMiniGameOnlineStatusByAppResponseBody body;

    public static SyncMiniGameOnlineStatusByAppResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncMiniGameOnlineStatusByAppResponse self = new SyncMiniGameOnlineStatusByAppResponse();
        return TeaModel.build(map, self);
    }

    public SyncMiniGameOnlineStatusByAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SyncMiniGameOnlineStatusByAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SyncMiniGameOnlineStatusByAppResponse setBody(SyncMiniGameOnlineStatusByAppResponseBody body) {
        this.body = body;
        return this;
    }
    public SyncMiniGameOnlineStatusByAppResponseBody getBody() {
        return this.body;
    }

}

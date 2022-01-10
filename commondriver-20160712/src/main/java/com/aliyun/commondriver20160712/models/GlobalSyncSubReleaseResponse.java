// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.commondriver20160712.models;

import com.aliyun.tea.*;

public class GlobalSyncSubReleaseResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GlobalSyncSubReleaseResponseBody body;

    public static GlobalSyncSubReleaseResponse build(java.util.Map<String, ?> map) throws Exception {
        GlobalSyncSubReleaseResponse self = new GlobalSyncSubReleaseResponse();
        return TeaModel.build(map, self);
    }

    public GlobalSyncSubReleaseResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GlobalSyncSubReleaseResponse setBody(GlobalSyncSubReleaseResponseBody body) {
        this.body = body;
        return this;
    }
    public GlobalSyncSubReleaseResponseBody getBody() {
        return this.body;
    }

}

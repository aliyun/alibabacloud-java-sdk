// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.commondriver20160712.models;

import com.aliyun.tea.*;

public class GlobalSyncSubDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GlobalSyncSubDataResponseBody body;

    public static GlobalSyncSubDataResponse build(java.util.Map<String, ?> map) throws Exception {
        GlobalSyncSubDataResponse self = new GlobalSyncSubDataResponse();
        return TeaModel.build(map, self);
    }

    public GlobalSyncSubDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GlobalSyncSubDataResponse setBody(GlobalSyncSubDataResponseBody body) {
        this.body = body;
        return this;
    }
    public GlobalSyncSubDataResponseBody getBody() {
        return this.body;
    }

}

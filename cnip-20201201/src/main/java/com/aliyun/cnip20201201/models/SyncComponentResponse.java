// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class SyncComponentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SyncComponentResponseBody body;

    public static SyncComponentResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncComponentResponse self = new SyncComponentResponse();
        return TeaModel.build(map, self);
    }

    public SyncComponentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SyncComponentResponse setBody(SyncComponentResponseBody body) {
        this.body = body;
        return this;
    }
    public SyncComponentResponseBody getBody() {
        return this.body;
    }

}

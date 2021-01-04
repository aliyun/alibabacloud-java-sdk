// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class SyncInstanceMetaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SyncInstanceMetaResponseBody body;

    public static SyncInstanceMetaResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncInstanceMetaResponse self = new SyncInstanceMetaResponse();
        return TeaModel.build(map, self);
    }

    public SyncInstanceMetaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SyncInstanceMetaResponse setBody(SyncInstanceMetaResponseBody body) {
        this.body = body;
        return this;
    }
    public SyncInstanceMetaResponseBody getBody() {
        return this.body;
    }

}

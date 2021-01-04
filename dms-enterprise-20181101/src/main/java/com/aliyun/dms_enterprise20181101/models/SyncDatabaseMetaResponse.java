// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class SyncDatabaseMetaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SyncDatabaseMetaResponseBody body;

    public static SyncDatabaseMetaResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncDatabaseMetaResponse self = new SyncDatabaseMetaResponse();
        return TeaModel.build(map, self);
    }

    public SyncDatabaseMetaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SyncDatabaseMetaResponse setBody(SyncDatabaseMetaResponseBody body) {
        this.body = body;
        return this;
    }
    public SyncDatabaseMetaResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class DisableBackupLogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DisableBackupLogResponseBody body;

    public static DisableBackupLogResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableBackupLogResponse self = new DisableBackupLogResponse();
        return TeaModel.build(map, self);
    }

    public DisableBackupLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableBackupLogResponse setBody(DisableBackupLogResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableBackupLogResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class EnableBackupLogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EnableBackupLogResponseBody body;

    public static EnableBackupLogResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableBackupLogResponse self = new EnableBackupLogResponse();
        return TeaModel.build(map, self);
    }

    public EnableBackupLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableBackupLogResponse setBody(EnableBackupLogResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableBackupLogResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class OpenBackupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OpenBackupResponseBody body;

    public static OpenBackupResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenBackupResponse self = new OpenBackupResponse();
        return TeaModel.build(map, self);
    }

    public OpenBackupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenBackupResponse setBody(OpenBackupResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenBackupResponseBody getBody() {
        return this.body;
    }

}

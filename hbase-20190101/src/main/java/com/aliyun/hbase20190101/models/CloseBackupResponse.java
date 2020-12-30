// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class CloseBackupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CloseBackupResponseBody body;

    public static CloseBackupResponse build(java.util.Map<String, ?> map) throws Exception {
        CloseBackupResponse self = new CloseBackupResponse();
        return TeaModel.build(map, self);
    }

    public CloseBackupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CloseBackupResponse setBody(CloseBackupResponseBody body) {
        this.body = body;
        return this;
    }
    public CloseBackupResponseBody getBody() {
        return this.body;
    }

}

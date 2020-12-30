// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class RestoreBackupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RestoreBackupResponseBody body;

    public static RestoreBackupResponse build(java.util.Map<String, ?> map) throws Exception {
        RestoreBackupResponse self = new RestoreBackupResponse();
        return TeaModel.build(map, self);
    }

    public RestoreBackupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RestoreBackupResponse setBody(RestoreBackupResponseBody body) {
        this.body = body;
        return this;
    }
    public RestoreBackupResponseBody getBody() {
        return this.body;
    }

}

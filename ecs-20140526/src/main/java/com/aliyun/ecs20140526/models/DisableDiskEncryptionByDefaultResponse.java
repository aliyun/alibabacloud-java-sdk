// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DisableDiskEncryptionByDefaultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableDiskEncryptionByDefaultResponseBody body;

    public static DisableDiskEncryptionByDefaultResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableDiskEncryptionByDefaultResponse self = new DisableDiskEncryptionByDefaultResponse();
        return TeaModel.build(map, self);
    }

    public DisableDiskEncryptionByDefaultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableDiskEncryptionByDefaultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableDiskEncryptionByDefaultResponse setBody(DisableDiskEncryptionByDefaultResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableDiskEncryptionByDefaultResponseBody getBody() {
        return this.body;
    }

}

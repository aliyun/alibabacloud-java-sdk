// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class EnableDiskEncryptionByDefaultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableDiskEncryptionByDefaultResponseBody body;

    public static EnableDiskEncryptionByDefaultResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableDiskEncryptionByDefaultResponse self = new EnableDiskEncryptionByDefaultResponse();
        return TeaModel.build(map, self);
    }

    public EnableDiskEncryptionByDefaultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableDiskEncryptionByDefaultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableDiskEncryptionByDefaultResponse setBody(EnableDiskEncryptionByDefaultResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableDiskEncryptionByDefaultResponseBody getBody() {
        return this.body;
    }

}

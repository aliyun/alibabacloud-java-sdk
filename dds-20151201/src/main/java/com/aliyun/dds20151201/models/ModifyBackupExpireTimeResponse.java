// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyBackupExpireTimeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyBackupExpireTimeResponseBody body;

    public static ModifyBackupExpireTimeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyBackupExpireTimeResponse self = new ModifyBackupExpireTimeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyBackupExpireTimeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyBackupExpireTimeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyBackupExpireTimeResponse setBody(ModifyBackupExpireTimeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyBackupExpireTimeResponseBody getBody() {
        return this.body;
    }

}

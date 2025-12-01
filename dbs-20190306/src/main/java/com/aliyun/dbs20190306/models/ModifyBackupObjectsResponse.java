// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class ModifyBackupObjectsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyBackupObjectsResponseBody body;

    public static ModifyBackupObjectsResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyBackupObjectsResponse self = new ModifyBackupObjectsResponse();
        return TeaModel.build(map, self);
    }

    public ModifyBackupObjectsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyBackupObjectsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyBackupObjectsResponse setBody(ModifyBackupObjectsResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyBackupObjectsResponseBody getBody() {
        return this.body;
    }

}

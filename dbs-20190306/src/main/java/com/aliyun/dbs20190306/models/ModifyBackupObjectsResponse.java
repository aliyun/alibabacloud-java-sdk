// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class ModifyBackupObjectsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ModifyBackupObjectsResponse setBody(ModifyBackupObjectsResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyBackupObjectsResponseBody getBody() {
        return this.body;
    }

}

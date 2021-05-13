// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class MigrateVmResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public MigrateVmResponseBody body;

    public static MigrateVmResponse build(java.util.Map<String, ?> map) throws Exception {
        MigrateVmResponse self = new MigrateVmResponse();
        return TeaModel.build(map, self);
    }

    public MigrateVmResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MigrateVmResponse setBody(MigrateVmResponseBody body) {
        this.body = body;
        return this;
    }
    public MigrateVmResponseBody getBody() {
        return this.body;
    }

}

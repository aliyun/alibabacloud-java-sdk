// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class MigrateEcuResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public MigrateEcuResponseBody body;

    public static MigrateEcuResponse build(java.util.Map<String, ?> map) throws Exception {
        MigrateEcuResponse self = new MigrateEcuResponse();
        return TeaModel.build(map, self);
    }

    public MigrateEcuResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MigrateEcuResponse setBody(MigrateEcuResponseBody body) {
        this.body = body;
        return this;
    }
    public MigrateEcuResponseBody getBody() {
        return this.body;
    }

}

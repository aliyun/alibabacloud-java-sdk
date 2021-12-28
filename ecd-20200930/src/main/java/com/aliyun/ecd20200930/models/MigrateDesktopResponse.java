// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class MigrateDesktopResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public MigrateDesktopResponseBody body;

    public static MigrateDesktopResponse build(java.util.Map<String, ?> map) throws Exception {
        MigrateDesktopResponse self = new MigrateDesktopResponse();
        return TeaModel.build(map, self);
    }

    public MigrateDesktopResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MigrateDesktopResponse setBody(MigrateDesktopResponseBody body) {
        this.body = body;
        return this;
    }
    public MigrateDesktopResponseBody getBody() {
        return this.body;
    }

}

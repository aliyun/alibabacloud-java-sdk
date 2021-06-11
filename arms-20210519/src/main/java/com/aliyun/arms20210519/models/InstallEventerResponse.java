// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210519.models;

import com.aliyun.tea.*;

public class InstallEventerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public InstallEventerResponseBody body;

    public static InstallEventerResponse build(java.util.Map<String, ?> map) throws Exception {
        InstallEventerResponse self = new InstallEventerResponse();
        return TeaModel.build(map, self);
    }

    public InstallEventerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InstallEventerResponse setBody(InstallEventerResponseBody body) {
        this.body = body;
        return this;
    }
    public InstallEventerResponseBody getBody() {
        return this.body;
    }

}

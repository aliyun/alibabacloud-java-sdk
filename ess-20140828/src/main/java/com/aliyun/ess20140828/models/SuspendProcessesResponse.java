// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class SuspendProcessesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SuspendProcessesResponseBody body;

    public static SuspendProcessesResponse build(java.util.Map<String, ?> map) throws Exception {
        SuspendProcessesResponse self = new SuspendProcessesResponse();
        return TeaModel.build(map, self);
    }

    public SuspendProcessesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SuspendProcessesResponse setBody(SuspendProcessesResponseBody body) {
        this.body = body;
        return this;
    }
    public SuspendProcessesResponseBody getBody() {
        return this.body;
    }

}

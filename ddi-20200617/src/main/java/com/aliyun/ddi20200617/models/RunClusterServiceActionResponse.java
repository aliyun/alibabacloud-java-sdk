// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class RunClusterServiceActionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RunClusterServiceActionResponseBody body;

    public static RunClusterServiceActionResponse build(java.util.Map<String, ?> map) throws Exception {
        RunClusterServiceActionResponse self = new RunClusterServiceActionResponse();
        return TeaModel.build(map, self);
    }

    public RunClusterServiceActionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunClusterServiceActionResponse setBody(RunClusterServiceActionResponseBody body) {
        this.body = body;
        return this;
    }
    public RunClusterServiceActionResponseBody getBody() {
        return this.body;
    }

}

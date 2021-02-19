// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class SetInstanceHealthResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetInstanceHealthResponseBody body;

    public static SetInstanceHealthResponse build(java.util.Map<String, ?> map) throws Exception {
        SetInstanceHealthResponse self = new SetInstanceHealthResponse();
        return TeaModel.build(map, self);
    }

    public SetInstanceHealthResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetInstanceHealthResponse setBody(SetInstanceHealthResponseBody body) {
        this.body = body;
        return this;
    }
    public SetInstanceHealthResponseBody getBody() {
        return this.body;
    }

}

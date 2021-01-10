// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class RunFunctionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RunFunctionResponseBody body;

    public static RunFunctionResponse build(java.util.Map<String, ?> map) throws Exception {
        RunFunctionResponse self = new RunFunctionResponse();
        return TeaModel.build(map, self);
    }

    public RunFunctionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunFunctionResponse setBody(RunFunctionResponseBody body) {
        this.body = body;
        return this;
    }
    public RunFunctionResponseBody getBody() {
        return this.body;
    }

}

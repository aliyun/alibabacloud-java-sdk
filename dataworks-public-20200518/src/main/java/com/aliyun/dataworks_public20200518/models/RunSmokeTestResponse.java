// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class RunSmokeTestResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RunSmokeTestResponseBody body;

    public static RunSmokeTestResponse build(java.util.Map<String, ?> map) throws Exception {
        RunSmokeTestResponse self = new RunSmokeTestResponse();
        return TeaModel.build(map, self);
    }

    public RunSmokeTestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunSmokeTestResponse setBody(RunSmokeTestResponseBody body) {
        this.body = body;
        return this;
    }
    public RunSmokeTestResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class RunMsaDiffResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RunMsaDiffResponseBody body;

    public static RunMsaDiffResponse build(java.util.Map<String, ?> map) throws Exception {
        RunMsaDiffResponse self = new RunMsaDiffResponse();
        return TeaModel.build(map, self);
    }

    public RunMsaDiffResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunMsaDiffResponse setBody(RunMsaDiffResponseBody body) {
        this.body = body;
        return this;
    }
    public RunMsaDiffResponseBody getBody() {
        return this.body;
    }

}

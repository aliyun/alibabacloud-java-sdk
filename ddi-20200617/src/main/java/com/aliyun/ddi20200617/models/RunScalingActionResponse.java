// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class RunScalingActionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RunScalingActionResponseBody body;

    public static RunScalingActionResponse build(java.util.Map<String, ?> map) throws Exception {
        RunScalingActionResponse self = new RunScalingActionResponse();
        return TeaModel.build(map, self);
    }

    public RunScalingActionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunScalingActionResponse setBody(RunScalingActionResponseBody body) {
        this.body = body;
        return this;
    }
    public RunScalingActionResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class RunCycleDagNodesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RunCycleDagNodesResponseBody body;

    public static RunCycleDagNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        RunCycleDagNodesResponse self = new RunCycleDagNodesResponse();
        return TeaModel.build(map, self);
    }

    public RunCycleDagNodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunCycleDagNodesResponse setBody(RunCycleDagNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public RunCycleDagNodesResponseBody getBody() {
        return this.body;
    }

}

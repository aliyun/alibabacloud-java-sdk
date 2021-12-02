// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphone20201230.models;

import com.aliyun.tea.*;

public class RunInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RunInstancesResponseBody body;

    public static RunInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        RunInstancesResponse self = new RunInstancesResponse();
        return TeaModel.build(map, self);
    }

    public RunInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunInstancesResponse setBody(RunInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public RunInstancesResponseBody getBody() {
        return this.body;
    }

}

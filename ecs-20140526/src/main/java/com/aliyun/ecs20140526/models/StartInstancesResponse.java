// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class StartInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StartInstancesResponseBody body;

    public static StartInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        StartInstancesResponse self = new StartInstancesResponse();
        return TeaModel.build(map, self);
    }

    public StartInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartInstancesResponse setBody(StartInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public StartInstancesResponseBody getBody() {
        return this.body;
    }

}

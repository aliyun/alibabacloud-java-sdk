// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ReActivateInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReActivateInstancesResponseBody body;

    public static ReActivateInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        ReActivateInstancesResponse self = new ReActivateInstancesResponse();
        return TeaModel.build(map, self);
    }

    public ReActivateInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReActivateInstancesResponse setBody(ReActivateInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public ReActivateInstancesResponseBody getBody() {
        return this.body;
    }

}

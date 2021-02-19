// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class DetachInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DetachInstancesResponseBody body;

    public static DetachInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachInstancesResponse self = new DetachInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DetachInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetachInstancesResponse setBody(DetachInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachInstancesResponseBody getBody() {
        return this.body;
    }

}

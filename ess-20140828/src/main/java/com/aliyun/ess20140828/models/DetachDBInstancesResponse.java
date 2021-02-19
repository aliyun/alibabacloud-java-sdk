// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20140828.models;

import com.aliyun.tea.*;

public class DetachDBInstancesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DetachDBInstancesResponseBody body;

    public static DetachDBInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachDBInstancesResponse self = new DetachDBInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DetachDBInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetachDBInstancesResponse setBody(DetachDBInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachDBInstancesResponseBody getBody() {
        return this.body;
    }

}

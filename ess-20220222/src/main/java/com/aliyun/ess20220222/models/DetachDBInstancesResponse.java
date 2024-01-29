// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class DetachDBInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DetachDBInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetachDBInstancesResponse setBody(DetachDBInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachDBInstancesResponseBody getBody() {
        return this.body;
    }

}

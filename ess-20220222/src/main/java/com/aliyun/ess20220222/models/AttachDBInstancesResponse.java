// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20220222.models;

import com.aliyun.tea.*;

public class AttachDBInstancesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AttachDBInstancesResponseBody body;

    public static AttachDBInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachDBInstancesResponse self = new AttachDBInstancesResponse();
        return TeaModel.build(map, self);
    }

    public AttachDBInstancesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachDBInstancesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AttachDBInstancesResponse setBody(AttachDBInstancesResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachDBInstancesResponseBody getBody() {
        return this.body;
    }

}

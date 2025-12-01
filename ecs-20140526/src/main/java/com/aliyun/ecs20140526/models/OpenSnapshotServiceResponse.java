// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class OpenSnapshotServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OpenSnapshotServiceResponseBody body;

    public static OpenSnapshotServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenSnapshotServiceResponse self = new OpenSnapshotServiceResponse();
        return TeaModel.build(map, self);
    }

    public OpenSnapshotServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenSnapshotServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OpenSnapshotServiceResponse setBody(OpenSnapshotServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenSnapshotServiceResponseBody getBody() {
        return this.body;
    }

}

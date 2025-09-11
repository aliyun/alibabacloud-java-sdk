// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hsm20231113.models;

import com.aliyun.tea.*;

public class RotateClusterManagedCertResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RotateClusterManagedCertResponseBody body;

    public static RotateClusterManagedCertResponse build(java.util.Map<String, ?> map) throws Exception {
        RotateClusterManagedCertResponse self = new RotateClusterManagedCertResponse();
        return TeaModel.build(map, self);
    }

    public RotateClusterManagedCertResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RotateClusterManagedCertResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RotateClusterManagedCertResponse setBody(RotateClusterManagedCertResponseBody body) {
        this.body = body;
        return this;
    }
    public RotateClusterManagedCertResponseBody getBody() {
        return this.body;
    }

}

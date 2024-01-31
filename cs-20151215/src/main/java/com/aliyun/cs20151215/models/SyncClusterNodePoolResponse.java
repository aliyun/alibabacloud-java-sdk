// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class SyncClusterNodePoolResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SyncClusterNodePoolResponseBody body;

    public static SyncClusterNodePoolResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncClusterNodePoolResponse self = new SyncClusterNodePoolResponse();
        return TeaModel.build(map, self);
    }

    public SyncClusterNodePoolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SyncClusterNodePoolResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SyncClusterNodePoolResponse setBody(SyncClusterNodePoolResponseBody body) {
        this.body = body;
        return this;
    }
    public SyncClusterNodePoolResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class SetDedicatedBlockStorageClusterDiskThroughputResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetDedicatedBlockStorageClusterDiskThroughputResponseBody body;

    public static SetDedicatedBlockStorageClusterDiskThroughputResponse build(java.util.Map<String, ?> map) throws Exception {
        SetDedicatedBlockStorageClusterDiskThroughputResponse self = new SetDedicatedBlockStorageClusterDiskThroughputResponse();
        return TeaModel.build(map, self);
    }

    public SetDedicatedBlockStorageClusterDiskThroughputResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetDedicatedBlockStorageClusterDiskThroughputResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetDedicatedBlockStorageClusterDiskThroughputResponse setBody(SetDedicatedBlockStorageClusterDiskThroughputResponseBody body) {
        this.body = body;
        return this;
    }
    public SetDedicatedBlockStorageClusterDiskThroughputResponseBody getBody() {
        return this.body;
    }

}

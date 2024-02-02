// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class CreateDedicatedBlockStorageClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDedicatedBlockStorageClusterResponseBody body;

    public static CreateDedicatedBlockStorageClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDedicatedBlockStorageClusterResponse self = new CreateDedicatedBlockStorageClusterResponse();
        return TeaModel.build(map, self);
    }

    public CreateDedicatedBlockStorageClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDedicatedBlockStorageClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDedicatedBlockStorageClusterResponse setBody(CreateDedicatedBlockStorageClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDedicatedBlockStorageClusterResponseBody getBody() {
        return this.body;
    }

}

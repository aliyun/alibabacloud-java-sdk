// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class DestroyClusterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DestroyClusterResponseBody body;

    public static DestroyClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        DestroyClusterResponse self = new DestroyClusterResponse();
        return TeaModel.build(map, self);
    }

    public DestroyClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DestroyClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DestroyClusterResponse setBody(DestroyClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public DestroyClusterResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class ResizeClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResizeClusterResponseBody body;

    public static ResizeClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        ResizeClusterResponse self = new ResizeClusterResponse();
        return TeaModel.build(map, self);
    }

    public ResizeClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResizeClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResizeClusterResponse setBody(ResizeClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public ResizeClusterResponseBody getBody() {
        return this.body;
    }

}

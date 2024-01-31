// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ScaleOutClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ScaleOutClusterResponseBody body;

    public static ScaleOutClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        ScaleOutClusterResponse self = new ScaleOutClusterResponse();
        return TeaModel.build(map, self);
    }

    public ScaleOutClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ScaleOutClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ScaleOutClusterResponse setBody(ScaleOutClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public ScaleOutClusterResponseBody getBody() {
        return this.body;
    }

}

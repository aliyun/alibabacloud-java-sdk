// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class ScaleClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ScaleClusterResponseBody body;

    public static ScaleClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        ScaleClusterResponse self = new ScaleClusterResponse();
        return TeaModel.build(map, self);
    }

    public ScaleClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ScaleClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ScaleClusterResponse setBody(ScaleClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public ScaleClusterResponseBody getBody() {
        return this.body;
    }

}

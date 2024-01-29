// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class RestartClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RestartClusterResponseBody body;

    public static RestartClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        RestartClusterResponse self = new RestartClusterResponse();
        return TeaModel.build(map, self);
    }

    public RestartClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RestartClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RestartClusterResponse setBody(RestartClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public RestartClusterResponseBody getBody() {
        return this.body;
    }

}

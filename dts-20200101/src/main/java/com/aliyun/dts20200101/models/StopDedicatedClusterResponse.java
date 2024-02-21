// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class StopDedicatedClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopDedicatedClusterResponseBody body;

    public static StopDedicatedClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        StopDedicatedClusterResponse self = new StopDedicatedClusterResponse();
        return TeaModel.build(map, self);
    }

    public StopDedicatedClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopDedicatedClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopDedicatedClusterResponse setBody(StopDedicatedClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public StopDedicatedClusterResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class StopRayClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopRayClusterResponseBody body;

    public static StopRayClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        StopRayClusterResponse self = new StopRayClusterResponse();
        return TeaModel.build(map, self);
    }

    public StopRayClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopRayClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopRayClusterResponse setBody(StopRayClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public StopRayClusterResponseBody getBody() {
        return this.body;
    }

}

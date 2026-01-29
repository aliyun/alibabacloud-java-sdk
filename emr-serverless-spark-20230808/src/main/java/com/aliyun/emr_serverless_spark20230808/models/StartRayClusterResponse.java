// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class StartRayClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartRayClusterResponseBody body;

    public static StartRayClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        StartRayClusterResponse self = new StartRayClusterResponse();
        return TeaModel.build(map, self);
    }

    public StartRayClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartRayClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartRayClusterResponse setBody(StartRayClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public StartRayClusterResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class StopSessionClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopSessionClusterResponseBody body;

    public static StopSessionClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        StopSessionClusterResponse self = new StopSessionClusterResponse();
        return TeaModel.build(map, self);
    }

    public StopSessionClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopSessionClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopSessionClusterResponse setBody(StopSessionClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public StopSessionClusterResponseBody getBody() {
        return this.body;
    }

}

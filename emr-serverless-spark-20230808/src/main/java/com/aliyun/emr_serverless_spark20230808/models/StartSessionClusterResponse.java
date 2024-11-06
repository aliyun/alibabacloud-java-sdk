// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class StartSessionClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartSessionClusterResponseBody body;

    public static StartSessionClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        StartSessionClusterResponse self = new StartSessionClusterResponse();
        return TeaModel.build(map, self);
    }

    public StartSessionClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartSessionClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartSessionClusterResponse setBody(StartSessionClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public StartSessionClusterResponseBody getBody() {
        return this.body;
    }

}

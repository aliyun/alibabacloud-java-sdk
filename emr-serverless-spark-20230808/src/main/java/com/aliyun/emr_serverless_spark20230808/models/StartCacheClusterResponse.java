// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class StartCacheClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StartCacheClusterResponseBody body;

    public static StartCacheClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        StartCacheClusterResponse self = new StartCacheClusterResponse();
        return TeaModel.build(map, self);
    }

    public StartCacheClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartCacheClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartCacheClusterResponse setBody(StartCacheClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public StartCacheClusterResponseBody getBody() {
        return this.body;
    }

}

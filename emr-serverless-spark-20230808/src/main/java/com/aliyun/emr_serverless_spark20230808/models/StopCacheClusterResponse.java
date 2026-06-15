// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class StopCacheClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopCacheClusterResponseBody body;

    public static StopCacheClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        StopCacheClusterResponse self = new StopCacheClusterResponse();
        return TeaModel.build(map, self);
    }

    public StopCacheClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopCacheClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopCacheClusterResponse setBody(StopCacheClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public StopCacheClusterResponseBody getBody() {
        return this.body;
    }

}

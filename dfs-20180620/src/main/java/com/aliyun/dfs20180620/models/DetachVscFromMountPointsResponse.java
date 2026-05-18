// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class DetachVscFromMountPointsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DetachVscFromMountPointsResponseBody body;

    public static DetachVscFromMountPointsResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachVscFromMountPointsResponse self = new DetachVscFromMountPointsResponse();
        return TeaModel.build(map, self);
    }

    public DetachVscFromMountPointsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetachVscFromMountPointsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetachVscFromMountPointsResponse setBody(DetachVscFromMountPointsResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachVscFromMountPointsResponseBody getBody() {
        return this.body;
    }

}

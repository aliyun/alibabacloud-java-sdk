// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class DetachVscMountPointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DetachVscMountPointResponseBody body;

    public static DetachVscMountPointResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachVscMountPointResponse self = new DetachVscMountPointResponse();
        return TeaModel.build(map, self);
    }

    public DetachVscMountPointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetachVscMountPointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetachVscMountPointResponse setBody(DetachVscMountPointResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachVscMountPointResponseBody getBody() {
        return this.body;
    }

}

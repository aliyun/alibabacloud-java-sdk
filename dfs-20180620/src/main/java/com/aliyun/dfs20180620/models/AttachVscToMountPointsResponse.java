// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class AttachVscToMountPointsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AttachVscToMountPointsResponseBody body;

    public static AttachVscToMountPointsResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachVscToMountPointsResponse self = new AttachVscToMountPointsResponse();
        return TeaModel.build(map, self);
    }

    public AttachVscToMountPointsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachVscToMountPointsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AttachVscToMountPointsResponse setBody(AttachVscToMountPointsResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachVscToMountPointsResponseBody getBody() {
        return this.body;
    }

}

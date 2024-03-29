// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class AttachVscMountPointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AttachVscMountPointResponseBody body;

    public static AttachVscMountPointResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachVscMountPointResponse self = new AttachVscMountPointResponse();
        return TeaModel.build(map, self);
    }

    public AttachVscMountPointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachVscMountPointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AttachVscMountPointResponse setBody(AttachVscMountPointResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachVscMountPointResponseBody getBody() {
        return this.body;
    }

}

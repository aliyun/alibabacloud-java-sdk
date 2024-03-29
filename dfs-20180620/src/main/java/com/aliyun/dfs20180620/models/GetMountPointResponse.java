// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class GetMountPointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMountPointResponseBody body;

    public static GetMountPointResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMountPointResponse self = new GetMountPointResponse();
        return TeaModel.build(map, self);
    }

    public GetMountPointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMountPointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMountPointResponse setBody(GetMountPointResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMountPointResponseBody getBody() {
        return this.body;
    }

}

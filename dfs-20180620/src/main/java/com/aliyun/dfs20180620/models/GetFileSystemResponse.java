// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class GetFileSystemResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetFileSystemResponseBody body;

    public static GetFileSystemResponse build(java.util.Map<String, ?> map) throws Exception {
        GetFileSystemResponse self = new GetFileSystemResponse();
        return TeaModel.build(map, self);
    }

    public GetFileSystemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetFileSystemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetFileSystemResponse setBody(GetFileSystemResponseBody body) {
        this.body = body;
        return this;
    }
    public GetFileSystemResponseBody getBody() {
        return this.body;
    }

}

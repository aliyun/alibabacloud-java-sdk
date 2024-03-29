// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class CreateFileSystemResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateFileSystemResponseBody body;

    public static CreateFileSystemResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateFileSystemResponse self = new CreateFileSystemResponse();
        return TeaModel.build(map, self);
    }

    public CreateFileSystemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateFileSystemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateFileSystemResponse setBody(CreateFileSystemResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateFileSystemResponseBody getBody() {
        return this.body;
    }

}

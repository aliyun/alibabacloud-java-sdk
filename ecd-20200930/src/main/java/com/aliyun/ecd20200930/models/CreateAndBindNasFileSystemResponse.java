// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateAndBindNasFileSystemResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAndBindNasFileSystemResponseBody body;

    public static CreateAndBindNasFileSystemResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAndBindNasFileSystemResponse self = new CreateAndBindNasFileSystemResponse();
        return TeaModel.build(map, self);
    }

    public CreateAndBindNasFileSystemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAndBindNasFileSystemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAndBindNasFileSystemResponse setBody(CreateAndBindNasFileSystemResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAndBindNasFileSystemResponseBody getBody() {
        return this.body;
    }

}

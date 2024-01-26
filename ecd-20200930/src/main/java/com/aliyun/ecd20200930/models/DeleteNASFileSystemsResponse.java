// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteNASFileSystemsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteNASFileSystemsResponseBody body;

    public static DeleteNASFileSystemsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteNASFileSystemsResponse self = new DeleteNASFileSystemsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteNASFileSystemsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteNASFileSystemsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteNASFileSystemsResponse setBody(DeleteNASFileSystemsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteNASFileSystemsResponseBody getBody() {
        return this.body;
    }

}

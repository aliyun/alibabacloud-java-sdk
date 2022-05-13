// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateNASFileSystemResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateNASFileSystemResponseBody body;

    public static CreateNASFileSystemResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateNASFileSystemResponse self = new CreateNASFileSystemResponse();
        return TeaModel.build(map, self);
    }

    public CreateNASFileSystemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateNASFileSystemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateNASFileSystemResponse setBody(CreateNASFileSystemResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateNASFileSystemResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class CreateOssSubDirectoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateOssSubDirectoryResponseBody body;

    public static CreateOssSubDirectoryResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOssSubDirectoryResponse self = new CreateOssSubDirectoryResponse();
        return TeaModel.build(map, self);
    }

    public CreateOssSubDirectoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOssSubDirectoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateOssSubDirectoryResponse setBody(CreateOssSubDirectoryResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOssSubDirectoryResponseBody getBody() {
        return this.body;
    }

}

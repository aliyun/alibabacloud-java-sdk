// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class CreateVscMountPointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateVscMountPointResponseBody body;

    public static CreateVscMountPointResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVscMountPointResponse self = new CreateVscMountPointResponse();
        return TeaModel.build(map, self);
    }

    public CreateVscMountPointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVscMountPointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateVscMountPointResponse setBody(CreateVscMountPointResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVscMountPointResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class CreateMountPointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMountPointResponseBody body;

    public static CreateMountPointResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMountPointResponse self = new CreateMountPointResponse();
        return TeaModel.build(map, self);
    }

    public CreateMountPointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMountPointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMountPointResponse setBody(CreateMountPointResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMountPointResponseBody getBody() {
        return this.body;
    }

}

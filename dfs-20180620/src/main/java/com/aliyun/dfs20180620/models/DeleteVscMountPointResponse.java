// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class DeleteVscMountPointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteVscMountPointResponseBody body;

    public static DeleteVscMountPointResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVscMountPointResponse self = new DeleteVscMountPointResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVscMountPointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteVscMountPointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteVscMountPointResponse setBody(DeleteVscMountPointResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVscMountPointResponseBody getBody() {
        return this.body;
    }

}

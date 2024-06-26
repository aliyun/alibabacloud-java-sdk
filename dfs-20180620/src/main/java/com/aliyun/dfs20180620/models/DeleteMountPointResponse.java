// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class DeleteMountPointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteMountPointResponseBody body;

    public static DeleteMountPointResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMountPointResponse self = new DeleteMountPointResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMountPointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMountPointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMountPointResponse setBody(DeleteMountPointResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMountPointResponseBody getBody() {
        return this.body;
    }

}

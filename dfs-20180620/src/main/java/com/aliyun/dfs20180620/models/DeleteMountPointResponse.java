// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class DeleteMountPointResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DeleteMountPointResponse setBody(DeleteMountPointResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMountPointResponseBody getBody() {
        return this.body;
    }

}

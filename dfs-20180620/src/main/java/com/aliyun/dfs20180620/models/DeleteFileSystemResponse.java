// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class DeleteFileSystemResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteFileSystemResponseBody body;

    public static DeleteFileSystemResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteFileSystemResponse self = new DeleteFileSystemResponse();
        return TeaModel.build(map, self);
    }

    public DeleteFileSystemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteFileSystemResponse setBody(DeleteFileSystemResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteFileSystemResponseBody getBody() {
        return this.body;
    }

}

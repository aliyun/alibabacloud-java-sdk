// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DeleteDirectoriesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDirectoriesResponseBody body;

    public static DeleteDirectoriesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDirectoriesResponse self = new DeleteDirectoriesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDirectoriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDirectoriesResponse setBody(DeleteDirectoriesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDirectoriesResponseBody getBody() {
        return this.body;
    }

}

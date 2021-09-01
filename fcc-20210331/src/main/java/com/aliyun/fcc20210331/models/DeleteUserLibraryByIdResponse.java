// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class DeleteUserLibraryByIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteUserLibraryByIdResponseBody body;

    public static DeleteUserLibraryByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserLibraryByIdResponse self = new DeleteUserLibraryByIdResponse();
        return TeaModel.build(map, self);
    }

    public DeleteUserLibraryByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteUserLibraryByIdResponse setBody(DeleteUserLibraryByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteUserLibraryByIdResponseBody getBody() {
        return this.body;
    }

}

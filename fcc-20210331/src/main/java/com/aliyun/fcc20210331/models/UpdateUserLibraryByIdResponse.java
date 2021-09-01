// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class UpdateUserLibraryByIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateUserLibraryByIdResponseBody body;

    public static UpdateUserLibraryByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserLibraryByIdResponse self = new UpdateUserLibraryByIdResponse();
        return TeaModel.build(map, self);
    }

    public UpdateUserLibraryByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateUserLibraryByIdResponse setBody(UpdateUserLibraryByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateUserLibraryByIdResponseBody getBody() {
        return this.body;
    }

}

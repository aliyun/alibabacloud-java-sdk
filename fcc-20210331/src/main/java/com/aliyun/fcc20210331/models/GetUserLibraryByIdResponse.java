// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class GetUserLibraryByIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetUserLibraryByIdResponseBody body;

    public static GetUserLibraryByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserLibraryByIdResponse self = new GetUserLibraryByIdResponse();
        return TeaModel.build(map, self);
    }

    public GetUserLibraryByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserLibraryByIdResponse setBody(GetUserLibraryByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserLibraryByIdResponseBody getBody() {
        return this.body;
    }

}

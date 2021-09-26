// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class CreateLibraryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateLibraryResponseBody body;

    public static CreateLibraryResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLibraryResponse self = new CreateLibraryResponse();
        return TeaModel.build(map, self);
    }

    public CreateLibraryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLibraryResponse setBody(CreateLibraryResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLibraryResponseBody getBody() {
        return this.body;
    }

}

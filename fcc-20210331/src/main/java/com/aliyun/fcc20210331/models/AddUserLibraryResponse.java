// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class AddUserLibraryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddUserLibraryResponseBody body;

    public static AddUserLibraryResponse build(java.util.Map<String, ?> map) throws Exception {
        AddUserLibraryResponse self = new AddUserLibraryResponse();
        return TeaModel.build(map, self);
    }

    public AddUserLibraryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddUserLibraryResponse setBody(AddUserLibraryResponseBody body) {
        this.body = body;
        return this;
    }
    public AddUserLibraryResponseBody getBody() {
        return this.body;
    }

}

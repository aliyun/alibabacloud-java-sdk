// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class AddUserLibraryByZipResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddUserLibraryByZipResponseBody body;

    public static AddUserLibraryByZipResponse build(java.util.Map<String, ?> map) throws Exception {
        AddUserLibraryByZipResponse self = new AddUserLibraryByZipResponse();
        return TeaModel.build(map, self);
    }

    public AddUserLibraryByZipResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddUserLibraryByZipResponse setBody(AddUserLibraryByZipResponseBody body) {
        this.body = body;
        return this;
    }
    public AddUserLibraryByZipResponseBody getBody() {
        return this.body;
    }

}

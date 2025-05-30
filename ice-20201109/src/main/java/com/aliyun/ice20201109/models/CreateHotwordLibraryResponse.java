// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateHotwordLibraryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateHotwordLibraryResponseBody body;

    public static CreateHotwordLibraryResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateHotwordLibraryResponse self = new CreateHotwordLibraryResponse();
        return TeaModel.build(map, self);
    }

    public CreateHotwordLibraryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateHotwordLibraryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateHotwordLibraryResponse setBody(CreateHotwordLibraryResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateHotwordLibraryResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class CreateLibraryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public CreateLibraryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateLibraryResponse setBody(CreateLibraryResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLibraryResponseBody getBody() {
        return this.body;
    }

}

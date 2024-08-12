// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class DeleteLibraryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteLibraryResponseBody body;

    public static DeleteLibraryResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLibraryResponse self = new DeleteLibraryResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLibraryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLibraryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteLibraryResponse setBody(DeleteLibraryResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLibraryResponseBody getBody() {
        return this.body;
    }

}

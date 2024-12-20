// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class UpdateQaLibraryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateQaLibraryResponseBody body;

    public static UpdateQaLibraryResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateQaLibraryResponse self = new UpdateQaLibraryResponse();
        return TeaModel.build(map, self);
    }

    public UpdateQaLibraryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateQaLibraryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateQaLibraryResponse setBody(UpdateQaLibraryResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateQaLibraryResponseBody getBody() {
        return this.body;
    }

}

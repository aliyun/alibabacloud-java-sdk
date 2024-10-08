// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class UpdateLibraryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateLibraryResponseBody body;

    public static UpdateLibraryResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLibraryResponse self = new UpdateLibraryResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLibraryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLibraryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateLibraryResponse setBody(UpdateLibraryResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLibraryResponseBody getBody() {
        return this.body;
    }

}

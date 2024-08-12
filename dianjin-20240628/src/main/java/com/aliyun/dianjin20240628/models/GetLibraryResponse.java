// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class GetLibraryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLibraryResponseBody body;

    public static GetLibraryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLibraryResponse self = new GetLibraryResponse();
        return TeaModel.build(map, self);
    }

    public GetLibraryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLibraryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLibraryResponse setBody(GetLibraryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLibraryResponseBody getBody() {
        return this.body;
    }

}

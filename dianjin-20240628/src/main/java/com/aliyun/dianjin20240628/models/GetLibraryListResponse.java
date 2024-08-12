// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class GetLibraryListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLibraryListResponseBody body;

    public static GetLibraryListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLibraryListResponse self = new GetLibraryListResponse();
        return TeaModel.build(map, self);
    }

    public GetLibraryListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLibraryListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLibraryListResponse setBody(GetLibraryListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLibraryListResponseBody getBody() {
        return this.body;
    }

}

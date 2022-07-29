// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetAlbumResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetAlbumResponseBody body;

    public static GetAlbumResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAlbumResponse self = new GetAlbumResponse();
        return TeaModel.build(map, self);
    }

    public GetAlbumResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAlbumResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAlbumResponse setBody(GetAlbumResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAlbumResponseBody getBody() {
        return this.body;
    }

}

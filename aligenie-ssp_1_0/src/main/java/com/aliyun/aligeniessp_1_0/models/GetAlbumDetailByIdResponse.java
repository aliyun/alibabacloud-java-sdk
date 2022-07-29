// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetAlbumDetailByIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetAlbumDetailByIdResponseBody body;

    public static GetAlbumDetailByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAlbumDetailByIdResponse self = new GetAlbumDetailByIdResponse();
        return TeaModel.build(map, self);
    }

    public GetAlbumDetailByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAlbumDetailByIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAlbumDetailByIdResponse setBody(GetAlbumDetailByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAlbumDetailByIdResponseBody getBody() {
        return this.body;
    }

}

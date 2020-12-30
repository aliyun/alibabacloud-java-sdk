// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphoto20170711.models;

import com.aliyun.tea.*;

public class GetAlbumsByNamesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAlbumsByNamesResponseBody body;

    public static GetAlbumsByNamesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAlbumsByNamesResponse self = new GetAlbumsByNamesResponse();
        return TeaModel.build(map, self);
    }

    public GetAlbumsByNamesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAlbumsByNamesResponse setBody(GetAlbumsByNamesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAlbumsByNamesResponseBody getBody() {
        return this.body;
    }

}

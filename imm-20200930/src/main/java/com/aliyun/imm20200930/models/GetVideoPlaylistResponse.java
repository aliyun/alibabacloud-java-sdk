// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GetVideoPlaylistResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetVideoPlaylistResponseBody body;

    public static GetVideoPlaylistResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVideoPlaylistResponse self = new GetVideoPlaylistResponse();
        return TeaModel.build(map, self);
    }

    public GetVideoPlaylistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVideoPlaylistResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetVideoPlaylistResponse setBody(GetVideoPlaylistResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVideoPlaylistResponseBody getBody() {
        return this.body;
    }

}

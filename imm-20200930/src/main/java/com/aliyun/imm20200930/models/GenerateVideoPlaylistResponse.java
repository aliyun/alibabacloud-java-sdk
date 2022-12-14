// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class GenerateVideoPlaylistResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GenerateVideoPlaylistResponseBody body;

    public static GenerateVideoPlaylistResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateVideoPlaylistResponse self = new GenerateVideoPlaylistResponse();
        return TeaModel.build(map, self);
    }

    public GenerateVideoPlaylistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateVideoPlaylistResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateVideoPlaylistResponse setBody(GenerateVideoPlaylistResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateVideoPlaylistResponseBody getBody() {
        return this.body;
    }

}

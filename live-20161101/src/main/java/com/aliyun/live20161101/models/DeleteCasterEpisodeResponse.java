// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteCasterEpisodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCasterEpisodeResponseBody body;

    public static DeleteCasterEpisodeResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCasterEpisodeResponse self = new DeleteCasterEpisodeResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCasterEpisodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCasterEpisodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCasterEpisodeResponse setBody(DeleteCasterEpisodeResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCasterEpisodeResponseBody getBody() {
        return this.body;
    }

}

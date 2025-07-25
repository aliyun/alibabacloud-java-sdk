// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ModifyCasterEpisodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyCasterEpisodeResponseBody body;

    public static ModifyCasterEpisodeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyCasterEpisodeResponse self = new ModifyCasterEpisodeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyCasterEpisodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyCasterEpisodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyCasterEpisodeResponse setBody(ModifyCasterEpisodeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyCasterEpisodeResponseBody getBody() {
        return this.body;
    }

}

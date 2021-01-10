// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ModifyCasterEpisodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ModifyCasterEpisodeResponse setBody(ModifyCasterEpisodeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyCasterEpisodeResponseBody getBody() {
        return this.body;
    }

}

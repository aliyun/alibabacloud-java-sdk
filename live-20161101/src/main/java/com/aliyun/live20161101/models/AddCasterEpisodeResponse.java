// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddCasterEpisodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddCasterEpisodeResponseBody body;

    public static AddCasterEpisodeResponse build(java.util.Map<String, ?> map) throws Exception {
        AddCasterEpisodeResponse self = new AddCasterEpisodeResponse();
        return TeaModel.build(map, self);
    }

    public AddCasterEpisodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddCasterEpisodeResponse setBody(AddCasterEpisodeResponseBody body) {
        this.body = body;
        return this;
    }
    public AddCasterEpisodeResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddCasterEpisodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public AddCasterEpisodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddCasterEpisodeResponse setBody(AddCasterEpisodeResponseBody body) {
        this.body = body;
        return this;
    }
    public AddCasterEpisodeResponseBody getBody() {
        return this.body;
    }

}

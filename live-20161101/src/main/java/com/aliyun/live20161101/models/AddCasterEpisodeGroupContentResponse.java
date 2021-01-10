// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddCasterEpisodeGroupContentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddCasterEpisodeGroupContentResponseBody body;

    public static AddCasterEpisodeGroupContentResponse build(java.util.Map<String, ?> map) throws Exception {
        AddCasterEpisodeGroupContentResponse self = new AddCasterEpisodeGroupContentResponse();
        return TeaModel.build(map, self);
    }

    public AddCasterEpisodeGroupContentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddCasterEpisodeGroupContentResponse setBody(AddCasterEpisodeGroupContentResponseBody body) {
        this.body = body;
        return this;
    }
    public AddCasterEpisodeGroupContentResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ailab_vision_public20210709.models;

import com.aliyun.tea.*;

public class MatchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public MatchResponseBody body;

    public static MatchResponse build(java.util.Map<String, ?> map) throws Exception {
        MatchResponse self = new MatchResponse();
        return TeaModel.build(map, self);
    }

    public MatchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MatchResponse setBody(MatchResponseBody body) {
        this.body = body;
        return this;
    }
    public MatchResponseBody getBody() {
        return this.body;
    }

}

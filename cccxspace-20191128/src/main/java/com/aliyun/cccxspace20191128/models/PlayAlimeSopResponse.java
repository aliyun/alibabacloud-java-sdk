// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class PlayAlimeSopResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PlayAlimeSopResponseBody body;

    public static PlayAlimeSopResponse build(java.util.Map<String, ?> map) throws Exception {
        PlayAlimeSopResponse self = new PlayAlimeSopResponse();
        return TeaModel.build(map, self);
    }

    public PlayAlimeSopResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PlayAlimeSopResponse setBody(PlayAlimeSopResponseBody body) {
        this.body = body;
        return this;
    }
    public PlayAlimeSopResponseBody getBody() {
        return this.body;
    }

}

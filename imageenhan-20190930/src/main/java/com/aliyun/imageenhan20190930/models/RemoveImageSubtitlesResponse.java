// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class RemoveImageSubtitlesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveImageSubtitlesResponseBody body;

    public static RemoveImageSubtitlesResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveImageSubtitlesResponse self = new RemoveImageSubtitlesResponse();
        return TeaModel.build(map, self);
    }

    public RemoveImageSubtitlesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveImageSubtitlesResponse setBody(RemoveImageSubtitlesResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveImageSubtitlesResponseBody getBody() {
        return this.body;
    }

}

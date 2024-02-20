// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageenhan20190930.models;

import com.aliyun.tea.*;

public class RemoveImageSubtitlesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public RemoveImageSubtitlesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveImageSubtitlesResponse setBody(RemoveImageSubtitlesResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveImageSubtitlesResponseBody getBody() {
        return this.body;
    }

}

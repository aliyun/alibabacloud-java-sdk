// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLiveAISubtitleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddLiveAISubtitleResponseBody body;

    public static AddLiveAISubtitleResponse build(java.util.Map<String, ?> map) throws Exception {
        AddLiveAISubtitleResponse self = new AddLiveAISubtitleResponse();
        return TeaModel.build(map, self);
    }

    public AddLiveAISubtitleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddLiveAISubtitleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddLiveAISubtitleResponse setBody(AddLiveAISubtitleResponseBody body) {
        this.body = body;
        return this;
    }
    public AddLiveAISubtitleResponseBody getBody() {
        return this.body;
    }

}

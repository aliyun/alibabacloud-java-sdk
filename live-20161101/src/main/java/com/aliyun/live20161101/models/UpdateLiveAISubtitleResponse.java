// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateLiveAISubtitleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateLiveAISubtitleResponseBody body;

    public static UpdateLiveAISubtitleResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLiveAISubtitleResponse self = new UpdateLiveAISubtitleResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLiveAISubtitleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLiveAISubtitleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateLiveAISubtitleResponse setBody(UpdateLiveAISubtitleResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLiveAISubtitleResponseBody getBody() {
        return this.body;
    }

}

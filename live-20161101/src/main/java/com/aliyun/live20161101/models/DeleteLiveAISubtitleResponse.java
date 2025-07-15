// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveAISubtitleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteLiveAISubtitleResponseBody body;

    public static DeleteLiveAISubtitleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveAISubtitleResponse self = new DeleteLiveAISubtitleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLiveAISubtitleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLiveAISubtitleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteLiveAISubtitleResponse setBody(DeleteLiveAISubtitleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLiveAISubtitleResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class AsrSentenceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AsrSentenceResponseBody body;

    public static AsrSentenceResponse build(java.util.Map<String, ?> map) throws Exception {
        AsrSentenceResponse self = new AsrSentenceResponse();
        return TeaModel.build(map, self);
    }

    public AsrSentenceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AsrSentenceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AsrSentenceResponse setBody(AsrSentenceResponseBody body) {
        this.body = body;
        return this;
    }
    public AsrSentenceResponseBody getBody() {
        return this.body;
    }

}

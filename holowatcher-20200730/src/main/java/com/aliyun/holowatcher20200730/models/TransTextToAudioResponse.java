// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class TransTextToAudioResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public TransTextToAudioResponseBody body;

    public static TransTextToAudioResponse build(java.util.Map<String, ?> map) throws Exception {
        TransTextToAudioResponse self = new TransTextToAudioResponse();
        return TeaModel.build(map, self);
    }

    public TransTextToAudioResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TransTextToAudioResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TransTextToAudioResponse setBody(TransTextToAudioResponseBody body) {
        this.body = body;
        return this;
    }
    public TransTextToAudioResponseBody getBody() {
        return this.body;
    }

}

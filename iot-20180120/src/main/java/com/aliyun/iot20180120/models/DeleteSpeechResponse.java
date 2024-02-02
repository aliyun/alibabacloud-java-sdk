// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class DeleteSpeechResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSpeechResponseBody body;

    public static DeleteSpeechResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSpeechResponse self = new DeleteSpeechResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSpeechResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSpeechResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSpeechResponse setBody(DeleteSpeechResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSpeechResponseBody getBody() {
        return this.body;
    }

}

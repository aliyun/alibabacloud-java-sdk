// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteRecognitionLibResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteRecognitionLibResponseBody body;

    public static DeleteRecognitionLibResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRecognitionLibResponse self = new DeleteRecognitionLibResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRecognitionLibResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRecognitionLibResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRecognitionLibResponse setBody(DeleteRecognitionLibResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRecognitionLibResponseBody getBody() {
        return this.body;
    }

}

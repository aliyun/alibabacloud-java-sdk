// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteRecognitionEntityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteRecognitionEntityResponseBody body;

    public static DeleteRecognitionEntityResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRecognitionEntityResponse self = new DeleteRecognitionEntityResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRecognitionEntityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRecognitionEntityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRecognitionEntityResponse setBody(DeleteRecognitionEntityResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRecognitionEntityResponseBody getBody() {
        return this.body;
    }

}

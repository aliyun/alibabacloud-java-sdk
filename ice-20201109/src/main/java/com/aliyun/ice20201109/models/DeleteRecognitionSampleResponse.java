// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class DeleteRecognitionSampleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteRecognitionSampleResponseBody body;

    public static DeleteRecognitionSampleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRecognitionSampleResponse self = new DeleteRecognitionSampleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRecognitionSampleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRecognitionSampleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRecognitionSampleResponse setBody(DeleteRecognitionSampleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRecognitionSampleResponseBody getBody() {
        return this.body;
    }

}

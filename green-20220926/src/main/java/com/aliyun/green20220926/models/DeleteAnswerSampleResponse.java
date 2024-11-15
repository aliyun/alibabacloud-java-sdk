// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class DeleteAnswerSampleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAnswerSampleResponseBody body;

    public static DeleteAnswerSampleResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAnswerSampleResponse self = new DeleteAnswerSampleResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAnswerSampleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAnswerSampleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAnswerSampleResponse setBody(DeleteAnswerSampleResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAnswerSampleResponseBody getBody() {
        return this.body;
    }

}

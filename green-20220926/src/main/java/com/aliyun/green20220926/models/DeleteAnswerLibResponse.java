// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class DeleteAnswerLibResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAnswerLibResponseBody body;

    public static DeleteAnswerLibResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAnswerLibResponse self = new DeleteAnswerLibResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAnswerLibResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAnswerLibResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAnswerLibResponse setBody(DeleteAnswerLibResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAnswerLibResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class DeleteSubmissionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSubmissionResponseBody body;

    public static DeleteSubmissionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSubmissionResponse self = new DeleteSubmissionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSubmissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSubmissionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSubmissionResponse setBody(DeleteSubmissionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSubmissionResponseBody getBody() {
        return this.body;
    }

}

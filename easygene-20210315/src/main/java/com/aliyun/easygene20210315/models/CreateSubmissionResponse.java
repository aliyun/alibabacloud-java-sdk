// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class CreateSubmissionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSubmissionResponseBody body;

    public static CreateSubmissionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSubmissionResponse self = new CreateSubmissionResponse();
        return TeaModel.build(map, self);
    }

    public CreateSubmissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSubmissionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSubmissionResponse setBody(CreateSubmissionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSubmissionResponseBody getBody() {
        return this.body;
    }

}

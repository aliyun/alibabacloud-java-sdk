// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class ResumeSubmissionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ResumeSubmissionResponseBody body;

    public static ResumeSubmissionResponse build(java.util.Map<String, ?> map) throws Exception {
        ResumeSubmissionResponse self = new ResumeSubmissionResponse();
        return TeaModel.build(map, self);
    }

    public ResumeSubmissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResumeSubmissionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResumeSubmissionResponse setBody(ResumeSubmissionResponseBody body) {
        this.body = body;
        return this;
    }
    public ResumeSubmissionResponseBody getBody() {
        return this.body;
    }

}

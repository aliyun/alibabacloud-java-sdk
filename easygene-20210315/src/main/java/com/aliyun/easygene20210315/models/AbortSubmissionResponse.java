// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class AbortSubmissionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AbortSubmissionResponseBody body;

    public static AbortSubmissionResponse build(java.util.Map<String, ?> map) throws Exception {
        AbortSubmissionResponse self = new AbortSubmissionResponse();
        return TeaModel.build(map, self);
    }

    public AbortSubmissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AbortSubmissionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AbortSubmissionResponse setBody(AbortSubmissionResponseBody body) {
        this.body = body;
        return this;
    }
    public AbortSubmissionResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class GetSubmissionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSubmissionResponseBody body;

    public static GetSubmissionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSubmissionResponse self = new GetSubmissionResponse();
        return TeaModel.build(map, self);
    }

    public GetSubmissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSubmissionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSubmissionResponse setBody(GetSubmissionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSubmissionResponseBody getBody() {
        return this.body;
    }

}

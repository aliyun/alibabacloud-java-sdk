// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetMeCorpSubmissionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMeCorpSubmissionResponseBody body;

    public static GetMeCorpSubmissionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMeCorpSubmissionResponse self = new GetMeCorpSubmissionResponse();
        return TeaModel.build(map, self);
    }

    public GetMeCorpSubmissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMeCorpSubmissionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMeCorpSubmissionResponse setBody(GetMeCorpSubmissionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMeCorpSubmissionResponseBody getBody() {
        return this.body;
    }

}

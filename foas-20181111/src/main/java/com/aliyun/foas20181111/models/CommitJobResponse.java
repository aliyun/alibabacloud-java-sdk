// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foas20181111.models;

import com.aliyun.tea.*;

public class CommitJobResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CommitJobResponseBody body;

    public static CommitJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CommitJobResponse self = new CommitJobResponse();
        return TeaModel.build(map, self);
    }

    public CommitJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CommitJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CommitJobResponse setBody(CommitJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CommitJobResponseBody getBody() {
        return this.body;
    }

}

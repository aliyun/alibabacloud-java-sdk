// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CommitFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CommitFileResponseBody body;

    public static CommitFileResponse build(java.util.Map<String, ?> map) throws Exception {
        CommitFileResponse self = new CommitFileResponse();
        return TeaModel.build(map, self);
    }

    public CommitFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CommitFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CommitFileResponse setBody(CommitFileResponseBody body) {
        this.body = body;
        return this;
    }
    public CommitFileResponseBody getBody() {
        return this.body;
    }

}

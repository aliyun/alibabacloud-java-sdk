// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class CreateCommitResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCommitResponseBody body;

    public static CreateCommitResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCommitResponse self = new CreateCommitResponse();
        return TeaModel.build(map, self);
    }

    public CreateCommitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCommitResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCommitResponse setBody(CreateCommitResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCommitResponseBody getBody() {
        return this.body;
    }

}

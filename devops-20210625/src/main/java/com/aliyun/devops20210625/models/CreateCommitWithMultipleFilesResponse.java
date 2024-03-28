// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateCommitWithMultipleFilesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCommitWithMultipleFilesResponseBody body;

    public static CreateCommitWithMultipleFilesResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCommitWithMultipleFilesResponse self = new CreateCommitWithMultipleFilesResponse();
        return TeaModel.build(map, self);
    }

    public CreateCommitWithMultipleFilesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCommitWithMultipleFilesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCommitWithMultipleFilesResponse setBody(CreateCommitWithMultipleFilesResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCommitWithMultipleFilesResponseBody getBody() {
        return this.body;
    }

}

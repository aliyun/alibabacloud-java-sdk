// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateMergeRequestResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMergeRequestResponseBody body;

    public static CreateMergeRequestResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMergeRequestResponse self = new CreateMergeRequestResponse();
        return TeaModel.build(map, self);
    }

    public CreateMergeRequestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMergeRequestResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMergeRequestResponse setBody(CreateMergeRequestResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMergeRequestResponseBody getBody() {
        return this.body;
    }

}

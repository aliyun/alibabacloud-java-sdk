// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateProtectdBranchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateProtectdBranchResponseBody body;

    public static CreateProtectdBranchResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateProtectdBranchResponse self = new CreateProtectdBranchResponse();
        return TeaModel.build(map, self);
    }

    public CreateProtectdBranchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateProtectdBranchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateProtectdBranchResponse setBody(CreateProtectdBranchResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateProtectdBranchResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class CreateBranchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateBranchResponseBody body;

    public static CreateBranchResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBranchResponse self = new CreateBranchResponse();
        return TeaModel.build(map, self);
    }

    public CreateBranchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateBranchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateBranchResponse setBody(CreateBranchResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateBranchResponseBody getBody() {
        return this.body;
    }

}

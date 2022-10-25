// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class UpdateProtectedBranchesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateProtectedBranchesResponseBody body;

    public static UpdateProtectedBranchesResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateProtectedBranchesResponse self = new UpdateProtectedBranchesResponse();
        return TeaModel.build(map, self);
    }

    public UpdateProtectedBranchesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateProtectedBranchesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateProtectedBranchesResponse setBody(UpdateProtectedBranchesResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateProtectedBranchesResponseBody getBody() {
        return this.body;
    }

}

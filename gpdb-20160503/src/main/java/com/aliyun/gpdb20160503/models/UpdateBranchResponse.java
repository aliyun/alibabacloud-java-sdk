// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class UpdateBranchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateBranchResponseBody body;

    public static UpdateBranchResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateBranchResponse self = new UpdateBranchResponse();
        return TeaModel.build(map, self);
    }

    public UpdateBranchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateBranchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateBranchResponse setBody(UpdateBranchResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateBranchResponseBody getBody() {
        return this.body;
    }

}

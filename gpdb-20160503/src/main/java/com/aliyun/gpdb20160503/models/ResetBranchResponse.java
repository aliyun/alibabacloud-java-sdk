// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ResetBranchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResetBranchResponseBody body;

    public static ResetBranchResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetBranchResponse self = new ResetBranchResponse();
        return TeaModel.build(map, self);
    }

    public ResetBranchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetBranchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResetBranchResponse setBody(ResetBranchResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetBranchResponseBody getBody() {
        return this.body;
    }

}

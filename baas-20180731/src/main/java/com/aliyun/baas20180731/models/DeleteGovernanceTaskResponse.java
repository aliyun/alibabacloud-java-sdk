// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DeleteGovernanceTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteGovernanceTaskResponseBody body;

    public static DeleteGovernanceTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteGovernanceTaskResponse self = new DeleteGovernanceTaskResponse();
        return TeaModel.build(map, self);
    }

    public DeleteGovernanceTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteGovernanceTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteGovernanceTaskResponse setBody(DeleteGovernanceTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteGovernanceTaskResponseBody getBody() {
        return this.body;
    }

}

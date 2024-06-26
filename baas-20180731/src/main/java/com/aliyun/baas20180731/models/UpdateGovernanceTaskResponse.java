// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class UpdateGovernanceTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateGovernanceTaskResponseBody body;

    public static UpdateGovernanceTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateGovernanceTaskResponse self = new UpdateGovernanceTaskResponse();
        return TeaModel.build(map, self);
    }

    public UpdateGovernanceTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateGovernanceTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateGovernanceTaskResponse setBody(UpdateGovernanceTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateGovernanceTaskResponseBody getBody() {
        return this.body;
    }

}

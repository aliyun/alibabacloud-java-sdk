// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class GetBlockchainCreateTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetBlockchainCreateTaskResponseBody body;

    public static GetBlockchainCreateTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBlockchainCreateTaskResponse self = new GetBlockchainCreateTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetBlockchainCreateTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBlockchainCreateTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBlockchainCreateTaskResponse setBody(GetBlockchainCreateTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBlockchainCreateTaskResponseBody getBody() {
        return this.body;
    }

}

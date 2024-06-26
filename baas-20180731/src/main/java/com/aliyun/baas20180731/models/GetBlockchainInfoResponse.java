// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class GetBlockchainInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetBlockchainInfoResponseBody body;

    public static GetBlockchainInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBlockchainInfoResponse self = new GetBlockchainInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetBlockchainInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBlockchainInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBlockchainInfoResponse setBody(GetBlockchainInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBlockchainInfoResponseBody getBody() {
        return this.body;
    }

}

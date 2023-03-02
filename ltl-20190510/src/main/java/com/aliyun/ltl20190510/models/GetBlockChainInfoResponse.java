// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ltl20190510.models;

import com.aliyun.tea.*;

public class GetBlockChainInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetBlockChainInfoResponseBody body;

    public static GetBlockChainInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBlockChainInfoResponse self = new GetBlockChainInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetBlockChainInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBlockChainInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBlockChainInfoResponse setBody(GetBlockChainInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBlockChainInfoResponseBody getBody() {
        return this.body;
    }

}

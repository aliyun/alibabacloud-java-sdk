// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class UnfreezeAntChainAccountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UnfreezeAntChainAccountResponseBody body;

    public static UnfreezeAntChainAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        UnfreezeAntChainAccountResponse self = new UnfreezeAntChainAccountResponse();
        return TeaModel.build(map, self);
    }

    public UnfreezeAntChainAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnfreezeAntChainAccountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnfreezeAntChainAccountResponse setBody(UnfreezeAntChainAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public UnfreezeAntChainAccountResponseBody getBody() {
        return this.body;
    }

}

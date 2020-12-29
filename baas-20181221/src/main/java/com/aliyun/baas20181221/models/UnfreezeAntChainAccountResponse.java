// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class UnfreezeAntChainAccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public UnfreezeAntChainAccountResponse setBody(UnfreezeAntChainAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public UnfreezeAntChainAccountResponseBody getBody() {
        return this.body;
    }

}

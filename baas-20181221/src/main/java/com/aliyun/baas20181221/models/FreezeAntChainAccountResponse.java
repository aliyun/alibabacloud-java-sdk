// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class FreezeAntChainAccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public FreezeAntChainAccountResponseBody body;

    public static FreezeAntChainAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        FreezeAntChainAccountResponse self = new FreezeAntChainAccountResponse();
        return TeaModel.build(map, self);
    }

    public FreezeAntChainAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FreezeAntChainAccountResponse setBody(FreezeAntChainAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public FreezeAntChainAccountResponseBody getBody() {
        return this.body;
    }

}

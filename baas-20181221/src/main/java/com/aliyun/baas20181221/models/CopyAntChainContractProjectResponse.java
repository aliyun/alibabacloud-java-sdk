// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class CopyAntChainContractProjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CopyAntChainContractProjectResponseBody body;

    public static CopyAntChainContractProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        CopyAntChainContractProjectResponse self = new CopyAntChainContractProjectResponse();
        return TeaModel.build(map, self);
    }

    public CopyAntChainContractProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CopyAntChainContractProjectResponse setBody(CopyAntChainContractProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public CopyAntChainContractProjectResponseBody getBody() {
        return this.body;
    }

}

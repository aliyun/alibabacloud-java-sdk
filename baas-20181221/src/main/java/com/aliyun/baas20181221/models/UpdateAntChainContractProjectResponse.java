// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class UpdateAntChainContractProjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateAntChainContractProjectResponseBody body;

    public static UpdateAntChainContractProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAntChainContractProjectResponse self = new UpdateAntChainContractProjectResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAntChainContractProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAntChainContractProjectResponse setBody(UpdateAntChainContractProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAntChainContractProjectResponseBody getBody() {
        return this.body;
    }

}

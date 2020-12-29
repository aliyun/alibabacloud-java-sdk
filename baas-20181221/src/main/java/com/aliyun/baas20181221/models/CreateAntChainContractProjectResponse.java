// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class CreateAntChainContractProjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateAntChainContractProjectResponseBody body;

    public static CreateAntChainContractProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAntChainContractProjectResponse self = new CreateAntChainContractProjectResponse();
        return TeaModel.build(map, self);
    }

    public CreateAntChainContractProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAntChainContractProjectResponse setBody(CreateAntChainContractProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAntChainContractProjectResponseBody getBody() {
        return this.body;
    }

}

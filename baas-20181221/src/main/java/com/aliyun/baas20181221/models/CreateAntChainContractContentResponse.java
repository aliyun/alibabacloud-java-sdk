// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class CreateAntChainContractContentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateAntChainContractContentResponseBody body;

    public static CreateAntChainContractContentResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAntChainContractContentResponse self = new CreateAntChainContractContentResponse();
        return TeaModel.build(map, self);
    }

    public CreateAntChainContractContentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAntChainContractContentResponse setBody(CreateAntChainContractContentResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAntChainContractContentResponseBody getBody() {
        return this.body;
    }

}

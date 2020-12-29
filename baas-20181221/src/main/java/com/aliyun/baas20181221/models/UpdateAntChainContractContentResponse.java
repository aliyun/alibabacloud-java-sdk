// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class UpdateAntChainContractContentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateAntChainContractContentResponseBody body;

    public static UpdateAntChainContractContentResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAntChainContractContentResponse self = new UpdateAntChainContractContentResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAntChainContractContentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAntChainContractContentResponse setBody(UpdateAntChainContractContentResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAntChainContractContentResponseBody getBody() {
        return this.body;
    }

}

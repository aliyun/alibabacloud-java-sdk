// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DeleteAntChainContractProjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteAntChainContractProjectResponseBody body;

    public static DeleteAntChainContractProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAntChainContractProjectResponse self = new DeleteAntChainContractProjectResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAntChainContractProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAntChainContractProjectResponse setBody(DeleteAntChainContractProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAntChainContractProjectResponseBody getBody() {
        return this.body;
    }

}

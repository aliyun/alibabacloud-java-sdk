// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class CreateAntChainContractProjectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public CreateAntChainContractProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAntChainContractProjectResponse setBody(CreateAntChainContractProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAntChainContractProjectResponseBody getBody() {
        return this.body;
    }

}

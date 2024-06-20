// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class CreateAntChainContractContentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public CreateAntChainContractContentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAntChainContractContentResponse setBody(CreateAntChainContractContentResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAntChainContractContentResponseBody getBody() {
        return this.body;
    }

}

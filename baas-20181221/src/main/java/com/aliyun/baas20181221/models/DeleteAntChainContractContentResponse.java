// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DeleteAntChainContractContentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAntChainContractContentResponseBody body;

    public static DeleteAntChainContractContentResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAntChainContractContentResponse self = new DeleteAntChainContractContentResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAntChainContractContentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAntChainContractContentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAntChainContractContentResponse setBody(DeleteAntChainContractContentResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAntChainContractContentResponseBody getBody() {
        return this.body;
    }

}

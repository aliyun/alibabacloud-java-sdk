// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class UpdateAntChainContractContentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public UpdateAntChainContractContentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAntChainContractContentResponse setBody(UpdateAntChainContractContentResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAntChainContractContentResponseBody getBody() {
        return this.body;
    }

}

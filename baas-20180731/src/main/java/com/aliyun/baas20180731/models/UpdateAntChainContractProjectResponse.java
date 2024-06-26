// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class UpdateAntChainContractProjectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public UpdateAntChainContractProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAntChainContractProjectResponse setBody(UpdateAntChainContractProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAntChainContractProjectResponseBody getBody() {
        return this.body;
    }

}

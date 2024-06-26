// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class ApplyBlockchainWithKeyAutoCreationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ApplyBlockchainWithKeyAutoCreationResponseBody body;

    public static ApplyBlockchainWithKeyAutoCreationResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyBlockchainWithKeyAutoCreationResponse self = new ApplyBlockchainWithKeyAutoCreationResponse();
        return TeaModel.build(map, self);
    }

    public ApplyBlockchainWithKeyAutoCreationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApplyBlockchainWithKeyAutoCreationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ApplyBlockchainWithKeyAutoCreationResponse setBody(ApplyBlockchainWithKeyAutoCreationResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplyBlockchainWithKeyAutoCreationResponseBody getBody() {
        return this.body;
    }

}

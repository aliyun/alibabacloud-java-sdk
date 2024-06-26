// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class ApplyPublicAntChainWithKeyAutoCreationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ApplyPublicAntChainWithKeyAutoCreationResponseBody body;

    public static ApplyPublicAntChainWithKeyAutoCreationResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyPublicAntChainWithKeyAutoCreationResponse self = new ApplyPublicAntChainWithKeyAutoCreationResponse();
        return TeaModel.build(map, self);
    }

    public ApplyPublicAntChainWithKeyAutoCreationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApplyPublicAntChainWithKeyAutoCreationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ApplyPublicAntChainWithKeyAutoCreationResponse setBody(ApplyPublicAntChainWithKeyAutoCreationResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplyPublicAntChainWithKeyAutoCreationResponseBody getBody() {
        return this.body;
    }

}

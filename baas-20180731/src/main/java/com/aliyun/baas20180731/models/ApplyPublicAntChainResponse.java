// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class ApplyPublicAntChainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ApplyPublicAntChainResponseBody body;

    public static ApplyPublicAntChainResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyPublicAntChainResponse self = new ApplyPublicAntChainResponse();
        return TeaModel.build(map, self);
    }

    public ApplyPublicAntChainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApplyPublicAntChainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ApplyPublicAntChainResponse setBody(ApplyPublicAntChainResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplyPublicAntChainResponseBody getBody() {
        return this.body;
    }

}

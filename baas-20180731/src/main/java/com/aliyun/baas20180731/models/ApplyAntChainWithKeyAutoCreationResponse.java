// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class ApplyAntChainWithKeyAutoCreationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ApplyAntChainWithKeyAutoCreationResponseBody body;

    public static ApplyAntChainWithKeyAutoCreationResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyAntChainWithKeyAutoCreationResponse self = new ApplyAntChainWithKeyAutoCreationResponse();
        return TeaModel.build(map, self);
    }

    public ApplyAntChainWithKeyAutoCreationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApplyAntChainWithKeyAutoCreationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ApplyAntChainWithKeyAutoCreationResponse setBody(ApplyAntChainWithKeyAutoCreationResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplyAntChainWithKeyAutoCreationResponseBody getBody() {
        return this.body;
    }

}

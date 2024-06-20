// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class UpdateAntChainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAntChainResponseBody body;

    public static UpdateAntChainResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAntChainResponse self = new UpdateAntChainResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAntChainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAntChainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAntChainResponse setBody(UpdateAntChainResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAntChainResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class UpdateAntChainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public UpdateAntChainResponse setBody(UpdateAntChainResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAntChainResponseBody getBody() {
        return this.body;
    }

}

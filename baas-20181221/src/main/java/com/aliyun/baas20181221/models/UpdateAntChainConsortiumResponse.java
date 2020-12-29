// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class UpdateAntChainConsortiumResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateAntChainConsortiumResponseBody body;

    public static UpdateAntChainConsortiumResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAntChainConsortiumResponse self = new UpdateAntChainConsortiumResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAntChainConsortiumResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAntChainConsortiumResponse setBody(UpdateAntChainConsortiumResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAntChainConsortiumResponseBody getBody() {
        return this.body;
    }

}

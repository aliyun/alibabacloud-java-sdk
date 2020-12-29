// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class CreateAntChainConsortiumResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateAntChainConsortiumResponseBody body;

    public static CreateAntChainConsortiumResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAntChainConsortiumResponse self = new CreateAntChainConsortiumResponse();
        return TeaModel.build(map, self);
    }

    public CreateAntChainConsortiumResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAntChainConsortiumResponse setBody(CreateAntChainConsortiumResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAntChainConsortiumResponseBody getBody() {
        return this.body;
    }

}

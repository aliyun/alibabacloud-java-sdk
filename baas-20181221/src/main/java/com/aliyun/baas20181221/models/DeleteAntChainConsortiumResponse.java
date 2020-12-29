// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DeleteAntChainConsortiumResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteAntChainConsortiumResponseBody body;

    public static DeleteAntChainConsortiumResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAntChainConsortiumResponse self = new DeleteAntChainConsortiumResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAntChainConsortiumResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAntChainConsortiumResponse setBody(DeleteAntChainConsortiumResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAntChainConsortiumResponseBody getBody() {
        return this.body;
    }

}

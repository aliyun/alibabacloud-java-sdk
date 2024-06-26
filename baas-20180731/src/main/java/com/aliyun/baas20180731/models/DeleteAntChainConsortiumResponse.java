// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DeleteAntChainConsortiumResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public DeleteAntChainConsortiumResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAntChainConsortiumResponse setBody(DeleteAntChainConsortiumResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAntChainConsortiumResponseBody getBody() {
        return this.body;
    }

}

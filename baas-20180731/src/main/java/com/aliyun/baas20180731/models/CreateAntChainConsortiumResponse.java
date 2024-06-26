// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class CreateAntChainConsortiumResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public CreateAntChainConsortiumResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAntChainConsortiumResponse setBody(CreateAntChainConsortiumResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAntChainConsortiumResponseBody getBody() {
        return this.body;
    }

}

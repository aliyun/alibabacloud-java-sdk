// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class StopLiveDomainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StopLiveDomainResponseBody body;

    public static StopLiveDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        StopLiveDomainResponse self = new StopLiveDomainResponse();
        return TeaModel.build(map, self);
    }

    public StopLiveDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopLiveDomainResponse setBody(StopLiveDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public StopLiveDomainResponseBody getBody() {
        return this.body;
    }

}

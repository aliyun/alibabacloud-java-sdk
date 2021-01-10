// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class StartLiveDomainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StartLiveDomainResponseBody body;

    public static StartLiveDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        StartLiveDomainResponse self = new StartLiveDomainResponse();
        return TeaModel.build(map, self);
    }

    public StartLiveDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartLiveDomainResponse setBody(StartLiveDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public StartLiveDomainResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class RetrieveDomainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RetrieveDomainResponseBody body;

    public static RetrieveDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        RetrieveDomainResponse self = new RetrieveDomainResponse();
        return TeaModel.build(map, self);
    }

    public RetrieveDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RetrieveDomainResponse setBody(RetrieveDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public RetrieveDomainResponseBody getBody() {
        return this.body;
    }

}

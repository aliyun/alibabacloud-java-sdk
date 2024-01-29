// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class RetrieveDomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public RetrieveDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RetrieveDomainResponse setBody(RetrieveDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public RetrieveDomainResponseBody getBody() {
        return this.body;
    }

}

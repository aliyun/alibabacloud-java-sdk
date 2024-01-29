// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddDomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddDomainResponseBody body;

    public static AddDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        AddDomainResponse self = new AddDomainResponse();
        return TeaModel.build(map, self);
    }

    public AddDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddDomainResponse setBody(AddDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public AddDomainResponseBody getBody() {
        return this.body;
    }

}

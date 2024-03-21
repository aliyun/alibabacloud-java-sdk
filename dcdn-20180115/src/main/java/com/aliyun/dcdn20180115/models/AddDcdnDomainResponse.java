// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class AddDcdnDomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddDcdnDomainResponseBody body;

    public static AddDcdnDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        AddDcdnDomainResponse self = new AddDcdnDomainResponse();
        return TeaModel.build(map, self);
    }

    public AddDcdnDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddDcdnDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddDcdnDomainResponse setBody(AddDcdnDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public AddDcdnDomainResponseBody getBody() {
        return this.body;
    }

}

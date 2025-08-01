// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class AddDomainNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddDomainNewResponseBody body;

    public static AddDomainNewResponse build(java.util.Map<String, ?> map) throws Exception {
        AddDomainNewResponse self = new AddDomainNewResponse();
        return TeaModel.build(map, self);
    }

    public AddDomainNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddDomainNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddDomainNewResponse setBody(AddDomainNewResponseBody body) {
        this.body = body;
        return this;
    }
    public AddDomainNewResponseBody getBody() {
        return this.body;
    }

}

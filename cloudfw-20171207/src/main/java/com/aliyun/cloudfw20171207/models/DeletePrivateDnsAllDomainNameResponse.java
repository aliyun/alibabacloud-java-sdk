// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DeletePrivateDnsAllDomainNameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeletePrivateDnsAllDomainNameResponseBody body;

    public static DeletePrivateDnsAllDomainNameResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePrivateDnsAllDomainNameResponse self = new DeletePrivateDnsAllDomainNameResponse();
        return TeaModel.build(map, self);
    }

    public DeletePrivateDnsAllDomainNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePrivateDnsAllDomainNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePrivateDnsAllDomainNameResponse setBody(DeletePrivateDnsAllDomainNameResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePrivateDnsAllDomainNameResponseBody getBody() {
        return this.body;
    }

}

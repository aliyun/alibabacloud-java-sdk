// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DeletePrivateDnsDomainNameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeletePrivateDnsDomainNameResponseBody body;

    public static DeletePrivateDnsDomainNameResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePrivateDnsDomainNameResponse self = new DeletePrivateDnsDomainNameResponse();
        return TeaModel.build(map, self);
    }

    public DeletePrivateDnsDomainNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePrivateDnsDomainNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePrivateDnsDomainNameResponse setBody(DeletePrivateDnsDomainNameResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePrivateDnsDomainNameResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class AddPrivateDnsDomainNameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddPrivateDnsDomainNameResponseBody body;

    public static AddPrivateDnsDomainNameResponse build(java.util.Map<String, ?> map) throws Exception {
        AddPrivateDnsDomainNameResponse self = new AddPrivateDnsDomainNameResponse();
        return TeaModel.build(map, self);
    }

    public AddPrivateDnsDomainNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddPrivateDnsDomainNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddPrivateDnsDomainNameResponse setBody(AddPrivateDnsDomainNameResponseBody body) {
        this.body = body;
        return this;
    }
    public AddPrivateDnsDomainNameResponseBody getBody() {
        return this.body;
    }

}

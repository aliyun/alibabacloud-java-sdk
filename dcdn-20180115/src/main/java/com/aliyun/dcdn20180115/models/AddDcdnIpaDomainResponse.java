// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class AddDcdnIpaDomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddDcdnIpaDomainResponseBody body;

    public static AddDcdnIpaDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        AddDcdnIpaDomainResponse self = new AddDcdnIpaDomainResponse();
        return TeaModel.build(map, self);
    }

    public AddDcdnIpaDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddDcdnIpaDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddDcdnIpaDomainResponse setBody(AddDcdnIpaDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public AddDcdnIpaDomainResponseBody getBody() {
        return this.body;
    }

}

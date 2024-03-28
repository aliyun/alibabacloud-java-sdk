// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class AddCorsDomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddCorsDomainResponseBody body;

    public static AddCorsDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        AddCorsDomainResponse self = new AddCorsDomainResponse();
        return TeaModel.build(map, self);
    }

    public AddCorsDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddCorsDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddCorsDomainResponse setBody(AddCorsDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public AddCorsDomainResponseBody getBody() {
        return this.body;
    }

}

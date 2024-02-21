// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class AddCdnDomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddCdnDomainResponseBody body;

    public static AddCdnDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        AddCdnDomainResponse self = new AddCdnDomainResponse();
        return TeaModel.build(map, self);
    }

    public AddCdnDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddCdnDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddCdnDomainResponse setBody(AddCdnDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public AddCdnDomainResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.beian20160810.models;

import com.aliyun.tea.*;

public class GetMainDomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMainDomainResponseBody body;

    public static GetMainDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMainDomainResponse self = new GetMainDomainResponse();
        return TeaModel.build(map, self);
    }

    public GetMainDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMainDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMainDomainResponse setBody(GetMainDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMainDomainResponseBody getBody() {
        return this.body;
    }

}

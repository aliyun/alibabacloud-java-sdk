// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class GetMainDomainNameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMainDomainNameResponseBody body;

    public static GetMainDomainNameResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMainDomainNameResponse self = new GetMainDomainNameResponse();
        return TeaModel.build(map, self);
    }

    public GetMainDomainNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMainDomainNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMainDomainNameResponse setBody(GetMainDomainNameResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMainDomainNameResponseBody getBody() {
        return this.body;
    }

}

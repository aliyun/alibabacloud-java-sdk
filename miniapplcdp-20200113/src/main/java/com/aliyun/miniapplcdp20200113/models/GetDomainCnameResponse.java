// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class GetDomainCnameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDomainCnameResponseBody body;

    public static GetDomainCnameResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDomainCnameResponse self = new GetDomainCnameResponse();
        return TeaModel.build(map, self);
    }

    public GetDomainCnameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDomainCnameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDomainCnameResponse setBody(GetDomainCnameResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDomainCnameResponseBody getBody() {
        return this.body;
    }

}

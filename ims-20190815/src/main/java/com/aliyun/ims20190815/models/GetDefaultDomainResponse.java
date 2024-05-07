// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815.models;

import com.aliyun.tea.*;

public class GetDefaultDomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDefaultDomainResponseBody body;

    public static GetDefaultDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDefaultDomainResponse self = new GetDefaultDomainResponse();
        return TeaModel.build(map, self);
    }

    public GetDefaultDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDefaultDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDefaultDomainResponse setBody(GetDefaultDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDefaultDomainResponseBody getBody() {
        return this.body;
    }

}

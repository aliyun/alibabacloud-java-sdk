// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class GetIngressDomainsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetIngressDomainsResponseBody body;

    public static GetIngressDomainsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIngressDomainsResponse self = new GetIngressDomainsResponse();
        return TeaModel.build(map, self);
    }

    public GetIngressDomainsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetIngressDomainsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetIngressDomainsResponse setBody(GetIngressDomainsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetIngressDomainsResponseBody getBody() {
        return this.body;
    }

}

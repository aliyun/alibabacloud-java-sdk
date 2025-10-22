// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class PushDomainsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PushDomainsResponseBody body;

    public static PushDomainsResponse build(java.util.Map<String, ?> map) throws Exception {
        PushDomainsResponse self = new PushDomainsResponse();
        return TeaModel.build(map, self);
    }

    public PushDomainsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PushDomainsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PushDomainsResponse setBody(PushDomainsResponseBody body) {
        this.body = body;
        return this;
    }
    public PushDomainsResponseBody getBody() {
        return this.body;
    }

}

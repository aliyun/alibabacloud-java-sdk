// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class EnableInitDomainAutoRedirectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableInitDomainAutoRedirectResponseBody body;

    public static EnableInitDomainAutoRedirectResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableInitDomainAutoRedirectResponse self = new EnableInitDomainAutoRedirectResponse();
        return TeaModel.build(map, self);
    }

    public EnableInitDomainAutoRedirectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableInitDomainAutoRedirectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableInitDomainAutoRedirectResponse setBody(EnableInitDomainAutoRedirectResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableInitDomainAutoRedirectResponseBody getBody() {
        return this.body;
    }

}

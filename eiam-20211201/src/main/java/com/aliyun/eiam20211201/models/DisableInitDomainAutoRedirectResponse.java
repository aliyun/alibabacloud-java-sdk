// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DisableInitDomainAutoRedirectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableInitDomainAutoRedirectResponseBody body;

    public static DisableInitDomainAutoRedirectResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableInitDomainAutoRedirectResponse self = new DisableInitDomainAutoRedirectResponse();
        return TeaModel.build(map, self);
    }

    public DisableInitDomainAutoRedirectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableInitDomainAutoRedirectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableInitDomainAutoRedirectResponse setBody(DisableInitDomainAutoRedirectResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableInitDomainAutoRedirectResponseBody getBody() {
        return this.body;
    }

}

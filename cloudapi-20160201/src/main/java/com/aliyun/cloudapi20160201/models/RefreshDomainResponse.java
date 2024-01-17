// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class RefreshDomainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RefreshDomainResponseBody body;

    public static RefreshDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        RefreshDomainResponse self = new RefreshDomainResponse();
        return TeaModel.build(map, self);
    }

    public RefreshDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RefreshDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RefreshDomainResponse setBody(RefreshDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public RefreshDomainResponseBody getBody() {
        return this.body;
    }

}

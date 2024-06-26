// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class CheckOrganizationDomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckOrganizationDomainResponseBody body;

    public static CheckOrganizationDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckOrganizationDomainResponse self = new CheckOrganizationDomainResponse();
        return TeaModel.build(map, self);
    }

    public CheckOrganizationDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckOrganizationDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckOrganizationDomainResponse setBody(CheckOrganizationDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckOrganizationDomainResponseBody getBody() {
        return this.body;
    }

}

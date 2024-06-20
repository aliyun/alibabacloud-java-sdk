// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class CheckFabricOrganizationDomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckFabricOrganizationDomainResponseBody body;

    public static CheckFabricOrganizationDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckFabricOrganizationDomainResponse self = new CheckFabricOrganizationDomainResponse();
        return TeaModel.build(map, self);
    }

    public CheckFabricOrganizationDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckFabricOrganizationDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckFabricOrganizationDomainResponse setBody(CheckFabricOrganizationDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckFabricOrganizationDomainResponseBody getBody() {
        return this.body;
    }

}

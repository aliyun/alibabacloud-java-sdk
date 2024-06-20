// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class CheckFabricConsortiumDomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CheckFabricConsortiumDomainResponseBody body;

    public static CheckFabricConsortiumDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckFabricConsortiumDomainResponse self = new CheckFabricConsortiumDomainResponse();
        return TeaModel.build(map, self);
    }

    public CheckFabricConsortiumDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckFabricConsortiumDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckFabricConsortiumDomainResponse setBody(CheckFabricConsortiumDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckFabricConsortiumDomainResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class ModifyCdnDomainOwnerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyCdnDomainOwnerResponseBody body;

    public static ModifyCdnDomainOwnerResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyCdnDomainOwnerResponse self = new ModifyCdnDomainOwnerResponse();
        return TeaModel.build(map, self);
    }

    public ModifyCdnDomainOwnerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyCdnDomainOwnerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyCdnDomainOwnerResponse setBody(ModifyCdnDomainOwnerResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyCdnDomainOwnerResponseBody getBody() {
        return this.body;
    }

}

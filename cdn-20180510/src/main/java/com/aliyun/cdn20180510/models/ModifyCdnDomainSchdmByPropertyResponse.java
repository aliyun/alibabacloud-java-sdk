// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class ModifyCdnDomainSchdmByPropertyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyCdnDomainSchdmByPropertyResponseBody body;

    public static ModifyCdnDomainSchdmByPropertyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyCdnDomainSchdmByPropertyResponse self = new ModifyCdnDomainSchdmByPropertyResponse();
        return TeaModel.build(map, self);
    }

    public ModifyCdnDomainSchdmByPropertyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyCdnDomainSchdmByPropertyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyCdnDomainSchdmByPropertyResponse setBody(ModifyCdnDomainSchdmByPropertyResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyCdnDomainSchdmByPropertyResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class ModifyDCdnDomainSchdmByPropertyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDCdnDomainSchdmByPropertyResponseBody body;

    public static ModifyDCdnDomainSchdmByPropertyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDCdnDomainSchdmByPropertyResponse self = new ModifyDCdnDomainSchdmByPropertyResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDCdnDomainSchdmByPropertyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDCdnDomainSchdmByPropertyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDCdnDomainSchdmByPropertyResponse setBody(ModifyDCdnDomainSchdmByPropertyResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDCdnDomainSchdmByPropertyResponseBody getBody() {
        return this.body;
    }

}

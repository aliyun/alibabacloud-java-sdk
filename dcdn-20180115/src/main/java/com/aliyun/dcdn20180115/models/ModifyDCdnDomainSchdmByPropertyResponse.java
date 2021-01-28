// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class ModifyDCdnDomainSchdmByPropertyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ModifyDCdnDomainSchdmByPropertyResponse setBody(ModifyDCdnDomainSchdmByPropertyResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDCdnDomainSchdmByPropertyResponseBody getBody() {
        return this.body;
    }

}

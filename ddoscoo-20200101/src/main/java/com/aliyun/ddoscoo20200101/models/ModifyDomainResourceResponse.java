// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifyDomainResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDomainResourceResponseBody body;

    public static ModifyDomainResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDomainResourceResponse self = new ModifyDomainResourceResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDomainResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDomainResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDomainResourceResponse setBody(ModifyDomainResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDomainResourceResponseBody getBody() {
        return this.body;
    }

}

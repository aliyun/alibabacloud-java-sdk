// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eipanycast20200309.models;

import com.aliyun.tea.*;

public class ModifyAnycastEipAddressSpecResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyAnycastEipAddressSpecResponseBody body;

    public static ModifyAnycastEipAddressSpecResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAnycastEipAddressSpecResponse self = new ModifyAnycastEipAddressSpecResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAnycastEipAddressSpecResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAnycastEipAddressSpecResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyAnycastEipAddressSpecResponse setBody(ModifyAnycastEipAddressSpecResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAnycastEipAddressSpecResponseBody getBody() {
        return this.body;
    }

}

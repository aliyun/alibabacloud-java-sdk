// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eipanycast20200309.models;

import com.aliyun.tea.*;

public class ModifyAnycastEipAddressSpecResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ModifyAnycastEipAddressSpecResponse setBody(ModifyAnycastEipAddressSpecResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAnycastEipAddressSpecResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eipanycast20200309.models;

import com.aliyun.tea.*;

public class ModifyAnycastEipAddressAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyAnycastEipAddressAttributeResponseBody body;

    public static ModifyAnycastEipAddressAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAnycastEipAddressAttributeResponse self = new ModifyAnycastEipAddressAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAnycastEipAddressAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAnycastEipAddressAttributeResponse setBody(ModifyAnycastEipAddressAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAnycastEipAddressAttributeResponseBody getBody() {
        return this.body;
    }

}

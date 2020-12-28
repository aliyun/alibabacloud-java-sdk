// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyEipAddressAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyEipAddressAttributeResponseBody body;

    public static ModifyEipAddressAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyEipAddressAttributeResponse self = new ModifyEipAddressAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyEipAddressAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyEipAddressAttributeResponse setBody(ModifyEipAddressAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyEipAddressAttributeResponseBody getBody() {
        return this.body;
    }

}

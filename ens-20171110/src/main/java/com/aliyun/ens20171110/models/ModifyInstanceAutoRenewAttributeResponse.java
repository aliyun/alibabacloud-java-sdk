// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ModifyInstanceAutoRenewAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyInstanceAutoRenewAttributeResponseBody body;

    public static ModifyInstanceAutoRenewAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceAutoRenewAttributeResponse self = new ModifyInstanceAutoRenewAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceAutoRenewAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyInstanceAutoRenewAttributeResponse setBody(ModifyInstanceAutoRenewAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyInstanceAutoRenewAttributeResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ModifyEnsEipAddressAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyEnsEipAddressAttributeResponseBody body;

    public static ModifyEnsEipAddressAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyEnsEipAddressAttributeResponse self = new ModifyEnsEipAddressAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyEnsEipAddressAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyEnsEipAddressAttributeResponse setBody(ModifyEnsEipAddressAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyEnsEipAddressAttributeResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ModifyNetworkAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyNetworkAttributeResponseBody body;

    public static ModifyNetworkAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyNetworkAttributeResponse self = new ModifyNetworkAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyNetworkAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyNetworkAttributeResponse setBody(ModifyNetworkAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyNetworkAttributeResponseBody getBody() {
        return this.body;
    }

}

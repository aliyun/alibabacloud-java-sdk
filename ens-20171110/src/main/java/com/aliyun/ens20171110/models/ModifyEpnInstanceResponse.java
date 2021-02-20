// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ModifyEpnInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyEpnInstanceResponseBody body;

    public static ModifyEpnInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyEpnInstanceResponse self = new ModifyEpnInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ModifyEpnInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyEpnInstanceResponse setBody(ModifyEpnInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyEpnInstanceResponseBody getBody() {
        return this.body;
    }

}

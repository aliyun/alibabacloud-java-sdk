// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyInstanceNetworkSpecResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyInstanceNetworkSpecResponseBody body;

    public static ModifyInstanceNetworkSpecResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceNetworkSpecResponse self = new ModifyInstanceNetworkSpecResponse();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceNetworkSpecResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyInstanceNetworkSpecResponse setBody(ModifyInstanceNetworkSpecResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyInstanceNetworkSpecResponseBody getBody() {
        return this.body;
    }

}

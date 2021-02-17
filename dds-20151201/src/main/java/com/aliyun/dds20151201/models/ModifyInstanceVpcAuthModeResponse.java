// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class ModifyInstanceVpcAuthModeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyInstanceVpcAuthModeResponseBody body;

    public static ModifyInstanceVpcAuthModeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceVpcAuthModeResponse self = new ModifyInstanceVpcAuthModeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceVpcAuthModeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyInstanceVpcAuthModeResponse setBody(ModifyInstanceVpcAuthModeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyInstanceVpcAuthModeResponseBody getBody() {
        return this.body;
    }

}

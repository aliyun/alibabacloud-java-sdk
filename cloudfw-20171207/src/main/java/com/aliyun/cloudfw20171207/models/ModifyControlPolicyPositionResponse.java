// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyControlPolicyPositionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyControlPolicyPositionResponseBody body;

    public static ModifyControlPolicyPositionResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyControlPolicyPositionResponse self = new ModifyControlPolicyPositionResponse();
        return TeaModel.build(map, self);
    }

    public ModifyControlPolicyPositionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyControlPolicyPositionResponse setBody(ModifyControlPolicyPositionResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyControlPolicyPositionResponseBody getBody() {
        return this.body;
    }

}

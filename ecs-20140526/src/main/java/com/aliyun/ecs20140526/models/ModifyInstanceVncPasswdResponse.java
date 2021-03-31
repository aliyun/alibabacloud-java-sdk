// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyInstanceVncPasswdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyInstanceVncPasswdResponseBody body;

    public static ModifyInstanceVncPasswdResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceVncPasswdResponse self = new ModifyInstanceVncPasswdResponse();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceVncPasswdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyInstanceVncPasswdResponse setBody(ModifyInstanceVncPasswdResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyInstanceVncPasswdResponseBody getBody() {
        return this.body;
    }

}

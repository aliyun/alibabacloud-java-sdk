// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class ModifyDDoSProtectConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDDoSProtectConfigResponseBody body;

    public static ModifyDDoSProtectConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDDoSProtectConfigResponse self = new ModifyDDoSProtectConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDDoSProtectConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDDoSProtectConfigResponse setBody(ModifyDDoSProtectConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDDoSProtectConfigResponseBody getBody() {
        return this.body;
    }

}

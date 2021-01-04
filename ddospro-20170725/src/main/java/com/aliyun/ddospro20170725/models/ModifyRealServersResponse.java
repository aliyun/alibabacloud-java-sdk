// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class ModifyRealServersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyRealServersResponseBody body;

    public static ModifyRealServersResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyRealServersResponse self = new ModifyRealServersResponse();
        return TeaModel.build(map, self);
    }

    public ModifyRealServersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyRealServersResponse setBody(ModifyRealServersResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyRealServersResponseBody getBody() {
        return this.body;
    }

}

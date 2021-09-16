// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ModifyDtsJobPasswordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDtsJobPasswordResponseBody body;

    public static ModifyDtsJobPasswordResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDtsJobPasswordResponse self = new ModifyDtsJobPasswordResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDtsJobPasswordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDtsJobPasswordResponse setBody(ModifyDtsJobPasswordResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDtsJobPasswordResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class ModifyUserCustomLogConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyUserCustomLogConfigResponseBody body;

    public static ModifyUserCustomLogConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyUserCustomLogConfigResponse self = new ModifyUserCustomLogConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyUserCustomLogConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyUserCustomLogConfigResponse setBody(ModifyUserCustomLogConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyUserCustomLogConfigResponseBody getBody() {
        return this.body;
    }

}

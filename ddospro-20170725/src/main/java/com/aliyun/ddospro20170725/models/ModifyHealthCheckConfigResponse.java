// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class ModifyHealthCheckConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyHealthCheckConfigResponseBody body;

    public static ModifyHealthCheckConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyHealthCheckConfigResponse self = new ModifyHealthCheckConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyHealthCheckConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyHealthCheckConfigResponse setBody(ModifyHealthCheckConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyHealthCheckConfigResponseBody getBody() {
        return this.body;
    }

}

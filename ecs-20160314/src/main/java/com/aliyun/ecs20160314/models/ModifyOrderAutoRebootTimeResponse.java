// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class ModifyOrderAutoRebootTimeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyOrderAutoRebootTimeResponseBody body;

    public static ModifyOrderAutoRebootTimeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyOrderAutoRebootTimeResponse self = new ModifyOrderAutoRebootTimeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyOrderAutoRebootTimeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyOrderAutoRebootTimeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyOrderAutoRebootTimeResponse setBody(ModifyOrderAutoRebootTimeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyOrderAutoRebootTimeResponseBody getBody() {
        return this.body;
    }

}

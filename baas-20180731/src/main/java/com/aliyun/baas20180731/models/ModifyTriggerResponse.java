// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class ModifyTriggerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyTriggerResponseBody body;

    public static ModifyTriggerResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyTriggerResponse self = new ModifyTriggerResponse();
        return TeaModel.build(map, self);
    }

    public ModifyTriggerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyTriggerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyTriggerResponse setBody(ModifyTriggerResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyTriggerResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class ModifyTransmitLineResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyTransmitLineResponseBody body;

    public static ModifyTransmitLineResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyTransmitLineResponse self = new ModifyTransmitLineResponse();
        return TeaModel.build(map, self);
    }

    public ModifyTransmitLineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyTransmitLineResponse setBody(ModifyTransmitLineResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyTransmitLineResponseBody getBody() {
        return this.body;
    }

}

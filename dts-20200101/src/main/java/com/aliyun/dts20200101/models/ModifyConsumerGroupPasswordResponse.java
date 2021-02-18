// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ModifyConsumerGroupPasswordResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyConsumerGroupPasswordResponseBody body;

    public static ModifyConsumerGroupPasswordResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyConsumerGroupPasswordResponse self = new ModifyConsumerGroupPasswordResponse();
        return TeaModel.build(map, self);
    }

    public ModifyConsumerGroupPasswordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyConsumerGroupPasswordResponse setBody(ModifyConsumerGroupPasswordResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyConsumerGroupPasswordResponseBody getBody() {
        return this.body;
    }

}

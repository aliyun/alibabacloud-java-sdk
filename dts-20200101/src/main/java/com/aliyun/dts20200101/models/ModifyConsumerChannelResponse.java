// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ModifyConsumerChannelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyConsumerChannelResponseBody body;

    public static ModifyConsumerChannelResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyConsumerChannelResponse self = new ModifyConsumerChannelResponse();
        return TeaModel.build(map, self);
    }

    public ModifyConsumerChannelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyConsumerChannelResponse setBody(ModifyConsumerChannelResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyConsumerChannelResponseBody getBody() {
        return this.body;
    }

}

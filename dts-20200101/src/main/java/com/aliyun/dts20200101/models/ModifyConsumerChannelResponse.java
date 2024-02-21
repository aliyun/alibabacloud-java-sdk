// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ModifyConsumerChannelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ModifyConsumerChannelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyConsumerChannelResponse setBody(ModifyConsumerChannelResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyConsumerChannelResponseBody getBody() {
        return this.body;
    }

}

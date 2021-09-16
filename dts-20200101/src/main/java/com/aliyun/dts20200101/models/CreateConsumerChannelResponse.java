// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class CreateConsumerChannelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateConsumerChannelResponseBody body;

    public static CreateConsumerChannelResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateConsumerChannelResponse self = new CreateConsumerChannelResponse();
        return TeaModel.build(map, self);
    }

    public CreateConsumerChannelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateConsumerChannelResponse setBody(CreateConsumerChannelResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateConsumerChannelResponseBody getBody() {
        return this.body;
    }

}

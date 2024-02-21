// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class CreateConsumerChannelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public CreateConsumerChannelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateConsumerChannelResponse setBody(CreateConsumerChannelResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateConsumerChannelResponseBody getBody() {
        return this.body;
    }

}

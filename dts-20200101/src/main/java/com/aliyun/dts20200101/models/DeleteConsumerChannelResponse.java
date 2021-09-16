// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class DeleteConsumerChannelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteConsumerChannelResponseBody body;

    public static DeleteConsumerChannelResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteConsumerChannelResponse self = new DeleteConsumerChannelResponse();
        return TeaModel.build(map, self);
    }

    public DeleteConsumerChannelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteConsumerChannelResponse setBody(DeleteConsumerChannelResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteConsumerChannelResponseBody getBody() {
        return this.body;
    }

}

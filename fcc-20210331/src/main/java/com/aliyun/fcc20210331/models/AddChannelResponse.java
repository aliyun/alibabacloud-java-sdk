// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class AddChannelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddChannelResponseBody body;

    public static AddChannelResponse build(java.util.Map<String, ?> map) throws Exception {
        AddChannelResponse self = new AddChannelResponse();
        return TeaModel.build(map, self);
    }

    public AddChannelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddChannelResponse setBody(AddChannelResponseBody body) {
        this.body = body;
        return this;
    }
    public AddChannelResponseBody getBody() {
        return this.body;
    }

}

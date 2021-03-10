// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateEdgeInstanceChannelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateEdgeInstanceChannelResponseBody body;

    public static CreateEdgeInstanceChannelResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateEdgeInstanceChannelResponse self = new CreateEdgeInstanceChannelResponse();
        return TeaModel.build(map, self);
    }

    public CreateEdgeInstanceChannelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateEdgeInstanceChannelResponse setBody(CreateEdgeInstanceChannelResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEdgeInstanceChannelResponseBody getBody() {
        return this.body;
    }

}

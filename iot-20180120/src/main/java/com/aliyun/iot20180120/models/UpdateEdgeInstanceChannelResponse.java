// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateEdgeInstanceChannelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateEdgeInstanceChannelResponseBody body;

    public static UpdateEdgeInstanceChannelResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateEdgeInstanceChannelResponse self = new UpdateEdgeInstanceChannelResponse();
        return TeaModel.build(map, self);
    }

    public UpdateEdgeInstanceChannelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateEdgeInstanceChannelResponse setBody(UpdateEdgeInstanceChannelResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateEdgeInstanceChannelResponseBody getBody() {
        return this.body;
    }

}

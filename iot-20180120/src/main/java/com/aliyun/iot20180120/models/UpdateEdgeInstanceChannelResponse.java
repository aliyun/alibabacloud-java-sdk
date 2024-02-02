// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateEdgeInstanceChannelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public UpdateEdgeInstanceChannelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateEdgeInstanceChannelResponse setBody(UpdateEdgeInstanceChannelResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateEdgeInstanceChannelResponseBody getBody() {
        return this.body;
    }

}

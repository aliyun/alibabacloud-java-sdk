// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CreateEdgeInstanceChannelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public CreateEdgeInstanceChannelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateEdgeInstanceChannelResponse setBody(CreateEdgeInstanceChannelResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateEdgeInstanceChannelResponseBody getBody() {
        return this.body;
    }

}

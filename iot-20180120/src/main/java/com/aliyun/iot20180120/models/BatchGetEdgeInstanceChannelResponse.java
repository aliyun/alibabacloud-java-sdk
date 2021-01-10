// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchGetEdgeInstanceChannelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchGetEdgeInstanceChannelResponseBody body;

    public static BatchGetEdgeInstanceChannelResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchGetEdgeInstanceChannelResponse self = new BatchGetEdgeInstanceChannelResponse();
        return TeaModel.build(map, self);
    }

    public BatchGetEdgeInstanceChannelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchGetEdgeInstanceChannelResponse setBody(BatchGetEdgeInstanceChannelResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchGetEdgeInstanceChannelResponseBody getBody() {
        return this.body;
    }

}

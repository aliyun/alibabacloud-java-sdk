// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchDeleteEdgeInstanceChannelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchDeleteEdgeInstanceChannelResponseBody body;

    public static BatchDeleteEdgeInstanceChannelResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteEdgeInstanceChannelResponse self = new BatchDeleteEdgeInstanceChannelResponse();
        return TeaModel.build(map, self);
    }

    public BatchDeleteEdgeInstanceChannelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchDeleteEdgeInstanceChannelResponse setBody(BatchDeleteEdgeInstanceChannelResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchDeleteEdgeInstanceChannelResponseBody getBody() {
        return this.body;
    }

}

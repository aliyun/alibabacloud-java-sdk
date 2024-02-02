// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchDeleteEdgeInstanceChannelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public BatchDeleteEdgeInstanceChannelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchDeleteEdgeInstanceChannelResponse setBody(BatchDeleteEdgeInstanceChannelResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchDeleteEdgeInstanceChannelResponseBody getBody() {
        return this.body;
    }

}

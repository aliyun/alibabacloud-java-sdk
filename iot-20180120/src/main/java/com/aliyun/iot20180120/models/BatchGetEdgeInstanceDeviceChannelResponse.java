// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchGetEdgeInstanceDeviceChannelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchGetEdgeInstanceDeviceChannelResponseBody body;

    public static BatchGetEdgeInstanceDeviceChannelResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchGetEdgeInstanceDeviceChannelResponse self = new BatchGetEdgeInstanceDeviceChannelResponse();
        return TeaModel.build(map, self);
    }

    public BatchGetEdgeInstanceDeviceChannelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchGetEdgeInstanceDeviceChannelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchGetEdgeInstanceDeviceChannelResponse setBody(BatchGetEdgeInstanceDeviceChannelResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchGetEdgeInstanceDeviceChannelResponseBody getBody() {
        return this.body;
    }

}

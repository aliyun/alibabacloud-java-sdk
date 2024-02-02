// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchSetEdgeInstanceDeviceChannelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchSetEdgeInstanceDeviceChannelResponseBody body;

    public static BatchSetEdgeInstanceDeviceChannelResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchSetEdgeInstanceDeviceChannelResponse self = new BatchSetEdgeInstanceDeviceChannelResponse();
        return TeaModel.build(map, self);
    }

    public BatchSetEdgeInstanceDeviceChannelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchSetEdgeInstanceDeviceChannelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchSetEdgeInstanceDeviceChannelResponse setBody(BatchSetEdgeInstanceDeviceChannelResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchSetEdgeInstanceDeviceChannelResponseBody getBody() {
        return this.body;
    }

}

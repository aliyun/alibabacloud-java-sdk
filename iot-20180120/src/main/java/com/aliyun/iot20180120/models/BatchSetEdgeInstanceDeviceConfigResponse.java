// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchSetEdgeInstanceDeviceConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchSetEdgeInstanceDeviceConfigResponseBody body;

    public static BatchSetEdgeInstanceDeviceConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchSetEdgeInstanceDeviceConfigResponse self = new BatchSetEdgeInstanceDeviceConfigResponse();
        return TeaModel.build(map, self);
    }

    public BatchSetEdgeInstanceDeviceConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchSetEdgeInstanceDeviceConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchSetEdgeInstanceDeviceConfigResponse setBody(BatchSetEdgeInstanceDeviceConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchSetEdgeInstanceDeviceConfigResponseBody getBody() {
        return this.body;
    }

}

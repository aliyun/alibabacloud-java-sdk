// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchClearEdgeInstanceDeviceConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public BatchClearEdgeInstanceDeviceConfigResponseBody body;

    public static BatchClearEdgeInstanceDeviceConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchClearEdgeInstanceDeviceConfigResponse self = new BatchClearEdgeInstanceDeviceConfigResponse();
        return TeaModel.build(map, self);
    }

    public BatchClearEdgeInstanceDeviceConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchClearEdgeInstanceDeviceConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchClearEdgeInstanceDeviceConfigResponse setBody(BatchClearEdgeInstanceDeviceConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchClearEdgeInstanceDeviceConfigResponseBody getBody() {
        return this.body;
    }

}

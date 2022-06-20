// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchGetEdgeInstanceDeviceConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public BatchGetEdgeInstanceDeviceConfigResponseBody body;

    public static BatchGetEdgeInstanceDeviceConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchGetEdgeInstanceDeviceConfigResponse self = new BatchGetEdgeInstanceDeviceConfigResponse();
        return TeaModel.build(map, self);
    }

    public BatchGetEdgeInstanceDeviceConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchGetEdgeInstanceDeviceConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchGetEdgeInstanceDeviceConfigResponse setBody(BatchGetEdgeInstanceDeviceConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchGetEdgeInstanceDeviceConfigResponseBody getBody() {
        return this.body;
    }

}

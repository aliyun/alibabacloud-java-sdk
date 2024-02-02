// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchGetEdgeInstanceDeviceDriverResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchGetEdgeInstanceDeviceDriverResponseBody body;

    public static BatchGetEdgeInstanceDeviceDriverResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchGetEdgeInstanceDeviceDriverResponse self = new BatchGetEdgeInstanceDeviceDriverResponse();
        return TeaModel.build(map, self);
    }

    public BatchGetEdgeInstanceDeviceDriverResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchGetEdgeInstanceDeviceDriverResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchGetEdgeInstanceDeviceDriverResponse setBody(BatchGetEdgeInstanceDeviceDriverResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchGetEdgeInstanceDeviceDriverResponseBody getBody() {
        return this.body;
    }

}

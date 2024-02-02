// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchGetDeviceStateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchGetDeviceStateResponseBody body;

    public static BatchGetDeviceStateResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchGetDeviceStateResponse self = new BatchGetDeviceStateResponse();
        return TeaModel.build(map, self);
    }

    public BatchGetDeviceStateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchGetDeviceStateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchGetDeviceStateResponse setBody(BatchGetDeviceStateResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchGetDeviceStateResponseBody getBody() {
        return this.body;
    }

}

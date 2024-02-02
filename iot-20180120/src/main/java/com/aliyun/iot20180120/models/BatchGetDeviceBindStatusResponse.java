// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchGetDeviceBindStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchGetDeviceBindStatusResponseBody body;

    public static BatchGetDeviceBindStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchGetDeviceBindStatusResponse self = new BatchGetDeviceBindStatusResponse();
        return TeaModel.build(map, self);
    }

    public BatchGetDeviceBindStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchGetDeviceBindStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchGetDeviceBindStatusResponse setBody(BatchGetDeviceBindStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchGetDeviceBindStatusResponseBody getBody() {
        return this.body;
    }

}

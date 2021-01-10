// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchGetDeviceBindStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public BatchGetDeviceBindStatusResponse setBody(BatchGetDeviceBindStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchGetDeviceBindStatusResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchUnbindProjectDevicesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchUnbindProjectDevicesResponseBody body;

    public static BatchUnbindProjectDevicesResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchUnbindProjectDevicesResponse self = new BatchUnbindProjectDevicesResponse();
        return TeaModel.build(map, self);
    }

    public BatchUnbindProjectDevicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchUnbindProjectDevicesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchUnbindProjectDevicesResponse setBody(BatchUnbindProjectDevicesResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchUnbindProjectDevicesResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class BatchRegisterDeviceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchRegisterDeviceResponseBody body;

    public static BatchRegisterDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchRegisterDeviceResponse self = new BatchRegisterDeviceResponse();
        return TeaModel.build(map, self);
    }

    public BatchRegisterDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchRegisterDeviceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchRegisterDeviceResponse setBody(BatchRegisterDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchRegisterDeviceResponseBody getBody() {
        return this.body;
    }

}

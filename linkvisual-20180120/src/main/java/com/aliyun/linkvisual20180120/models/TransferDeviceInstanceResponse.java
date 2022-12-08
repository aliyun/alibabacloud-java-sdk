// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class TransferDeviceInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public TransferDeviceInstanceResponseBody body;

    public static TransferDeviceInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        TransferDeviceInstanceResponse self = new TransferDeviceInstanceResponse();
        return TeaModel.build(map, self);
    }

    public TransferDeviceInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TransferDeviceInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TransferDeviceInstanceResponse setBody(TransferDeviceInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public TransferDeviceInstanceResponseBody getBody() {
        return this.body;
    }

}

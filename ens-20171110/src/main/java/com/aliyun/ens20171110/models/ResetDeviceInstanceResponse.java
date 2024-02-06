// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ResetDeviceInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResetDeviceInstanceResponseBody body;

    public static ResetDeviceInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        ResetDeviceInstanceResponse self = new ResetDeviceInstanceResponse();
        return TeaModel.build(map, self);
    }

    public ResetDeviceInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResetDeviceInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResetDeviceInstanceResponse setBody(ResetDeviceInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public ResetDeviceInstanceResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class CancelOTATaskByDeviceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CancelOTATaskByDeviceResponseBody body;

    public static CancelOTATaskByDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelOTATaskByDeviceResponse self = new CancelOTATaskByDeviceResponse();
        return TeaModel.build(map, self);
    }

    public CancelOTATaskByDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelOTATaskByDeviceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelOTATaskByDeviceResponse setBody(CancelOTATaskByDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelOTATaskByDeviceResponseBody getBody() {
        return this.body;
    }

}

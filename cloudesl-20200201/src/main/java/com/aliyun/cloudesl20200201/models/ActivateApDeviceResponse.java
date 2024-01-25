// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudesl20200201.models;

import com.aliyun.tea.*;

public class ActivateApDeviceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ActivateApDeviceResponseBody body;

    public static ActivateApDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        ActivateApDeviceResponse self = new ActivateApDeviceResponse();
        return TeaModel.build(map, self);
    }

    public ActivateApDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ActivateApDeviceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ActivateApDeviceResponse setBody(ActivateApDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public ActivateApDeviceResponseBody getBody() {
        return this.body;
    }

}

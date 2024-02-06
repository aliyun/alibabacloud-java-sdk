// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class AddDeviceInternetPortResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddDeviceInternetPortResponseBody body;

    public static AddDeviceInternetPortResponse build(java.util.Map<String, ?> map) throws Exception {
        AddDeviceInternetPortResponse self = new AddDeviceInternetPortResponse();
        return TeaModel.build(map, self);
    }

    public AddDeviceInternetPortResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddDeviceInternetPortResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddDeviceInternetPortResponse setBody(AddDeviceInternetPortResponseBody body) {
        this.body = body;
        return this;
    }
    public AddDeviceInternetPortResponseBody getBody() {
        return this.body;
    }

}

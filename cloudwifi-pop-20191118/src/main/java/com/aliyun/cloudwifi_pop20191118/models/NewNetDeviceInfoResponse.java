// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudwifi_pop20191118.models;

import com.aliyun.tea.*;

public class NewNetDeviceInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public NewNetDeviceInfoResponseBody body;

    public static NewNetDeviceInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        NewNetDeviceInfoResponse self = new NewNetDeviceInfoResponse();
        return TeaModel.build(map, self);
    }

    public NewNetDeviceInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public NewNetDeviceInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public NewNetDeviceInfoResponse setBody(NewNetDeviceInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public NewNetDeviceInfoResponseBody getBody() {
        return this.body;
    }

}

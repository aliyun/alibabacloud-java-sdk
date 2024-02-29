// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class SyncDeviceStatusWithAkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SyncDeviceStatusWithAkResponseBody body;

    public static SyncDeviceStatusWithAkResponse build(java.util.Map<String, ?> map) throws Exception {
        SyncDeviceStatusWithAkResponse self = new SyncDeviceStatusWithAkResponse();
        return TeaModel.build(map, self);
    }

    public SyncDeviceStatusWithAkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SyncDeviceStatusWithAkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SyncDeviceStatusWithAkResponse setBody(SyncDeviceStatusWithAkResponseBody body) {
        this.body = body;
        return this;
    }
    public SyncDeviceStatusWithAkResponseBody getBody() {
        return this.body;
    }

}

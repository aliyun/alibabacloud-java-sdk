// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lto20210707.models;

import com.aliyun.tea.*;

public class DisableDeviceGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableDeviceGroupResponseBody body;

    public static DisableDeviceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableDeviceGroupResponse self = new DisableDeviceGroupResponse();
        return TeaModel.build(map, self);
    }

    public DisableDeviceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableDeviceGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableDeviceGroupResponse setBody(DisableDeviceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableDeviceGroupResponseBody getBody() {
        return this.body;
    }

}

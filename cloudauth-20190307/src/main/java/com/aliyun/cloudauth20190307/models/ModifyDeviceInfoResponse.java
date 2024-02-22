// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class ModifyDeviceInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDeviceInfoResponseBody body;

    public static ModifyDeviceInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDeviceInfoResponse self = new ModifyDeviceInfoResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDeviceInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDeviceInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDeviceInfoResponse setBody(ModifyDeviceInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDeviceInfoResponseBody getBody() {
        return this.body;
    }

}

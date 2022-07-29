// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class SetDeviceSettingResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SetDeviceSettingResponseBody body;

    public static SetDeviceSettingResponse build(java.util.Map<String, ?> map) throws Exception {
        SetDeviceSettingResponse self = new SetDeviceSettingResponse();
        return TeaModel.build(map, self);
    }

    public SetDeviceSettingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetDeviceSettingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetDeviceSettingResponse setBody(SetDeviceSettingResponseBody body) {
        this.body = body;
        return this;
    }
    public SetDeviceSettingResponseBody getBody() {
        return this.body;
    }

}

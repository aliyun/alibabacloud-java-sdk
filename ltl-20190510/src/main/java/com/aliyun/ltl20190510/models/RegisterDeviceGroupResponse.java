// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ltl20190510.models;

import com.aliyun.tea.*;

public class RegisterDeviceGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RegisterDeviceGroupResponseBody body;

    public static RegisterDeviceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        RegisterDeviceGroupResponse self = new RegisterDeviceGroupResponse();
        return TeaModel.build(map, self);
    }

    public RegisterDeviceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RegisterDeviceGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RegisterDeviceGroupResponse setBody(RegisterDeviceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public RegisterDeviceGroupResponseBody getBody() {
        return this.body;
    }

}

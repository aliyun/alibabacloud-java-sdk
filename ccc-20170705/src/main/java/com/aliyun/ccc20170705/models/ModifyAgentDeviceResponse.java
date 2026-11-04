// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class ModifyAgentDeviceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyAgentDeviceResponseBody body;

    public static ModifyAgentDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAgentDeviceResponse self = new ModifyAgentDeviceResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAgentDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAgentDeviceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyAgentDeviceResponse setBody(ModifyAgentDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAgentDeviceResponseBody getBody() {
        return this.body;
    }

}

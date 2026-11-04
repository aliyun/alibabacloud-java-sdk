// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class AddAgentDeviceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddAgentDeviceResponseBody body;

    public static AddAgentDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        AddAgentDeviceResponse self = new AddAgentDeviceResponse();
        return TeaModel.build(map, self);
    }

    public AddAgentDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddAgentDeviceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddAgentDeviceResponse setBody(AddAgentDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public AddAgentDeviceResponseBody getBody() {
        return this.body;
    }

}

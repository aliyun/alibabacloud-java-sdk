// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyInstanceNetworkOptionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyInstanceNetworkOptionsResponseBody body;

    public static ModifyInstanceNetworkOptionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyInstanceNetworkOptionsResponse self = new ModifyInstanceNetworkOptionsResponse();
        return TeaModel.build(map, self);
    }

    public ModifyInstanceNetworkOptionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyInstanceNetworkOptionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyInstanceNetworkOptionsResponse setBody(ModifyInstanceNetworkOptionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyInstanceNetworkOptionsResponseBody getBody() {
        return this.body;
    }

}

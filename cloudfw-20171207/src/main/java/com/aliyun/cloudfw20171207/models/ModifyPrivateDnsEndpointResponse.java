// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyPrivateDnsEndpointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyPrivateDnsEndpointResponseBody body;

    public static ModifyPrivateDnsEndpointResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyPrivateDnsEndpointResponse self = new ModifyPrivateDnsEndpointResponse();
        return TeaModel.build(map, self);
    }

    public ModifyPrivateDnsEndpointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyPrivateDnsEndpointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyPrivateDnsEndpointResponse setBody(ModifyPrivateDnsEndpointResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyPrivateDnsEndpointResponseBody getBody() {
        return this.body;
    }

}

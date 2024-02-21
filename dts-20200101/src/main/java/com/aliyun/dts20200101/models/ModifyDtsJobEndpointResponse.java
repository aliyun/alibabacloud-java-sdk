// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ModifyDtsJobEndpointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDtsJobEndpointResponseBody body;

    public static ModifyDtsJobEndpointResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDtsJobEndpointResponse self = new ModifyDtsJobEndpointResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDtsJobEndpointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDtsJobEndpointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDtsJobEndpointResponse setBody(ModifyDtsJobEndpointResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDtsJobEndpointResponseBody getBody() {
        return this.body;
    }

}

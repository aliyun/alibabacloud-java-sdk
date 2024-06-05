// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_dg20230914.models;

import com.aliyun.tea.*;

public class ModifyGatewayResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyGatewayResponseBody body;

    public static ModifyGatewayResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyGatewayResponse self = new ModifyGatewayResponse();
        return TeaModel.build(map, self);
    }

    public ModifyGatewayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyGatewayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyGatewayResponse setBody(ModifyGatewayResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyGatewayResponseBody getBody() {
        return this.body;
    }

}

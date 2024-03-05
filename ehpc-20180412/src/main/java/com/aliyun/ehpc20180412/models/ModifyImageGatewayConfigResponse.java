// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class ModifyImageGatewayConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyImageGatewayConfigResponseBody body;

    public static ModifyImageGatewayConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyImageGatewayConfigResponse self = new ModifyImageGatewayConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyImageGatewayConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyImageGatewayConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyImageGatewayConfigResponse setBody(ModifyImageGatewayConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyImageGatewayConfigResponseBody getBody() {
        return this.body;
    }

}

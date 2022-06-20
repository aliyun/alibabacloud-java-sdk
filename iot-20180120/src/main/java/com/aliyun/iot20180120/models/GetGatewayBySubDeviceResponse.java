// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetGatewayBySubDeviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetGatewayBySubDeviceResponseBody body;

    public static GetGatewayBySubDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetGatewayBySubDeviceResponse self = new GetGatewayBySubDeviceResponse();
        return TeaModel.build(map, self);
    }

    public GetGatewayBySubDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetGatewayBySubDeviceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetGatewayBySubDeviceResponse setBody(GetGatewayBySubDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetGatewayBySubDeviceResponseBody getBody() {
        return this.body;
    }

}

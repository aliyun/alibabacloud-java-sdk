// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.et_industry_openapi20200824.models;

import com.aliyun.tea.*;

public class GetMqttConnectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMqttConnectResponseBody body;

    public static GetMqttConnectResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMqttConnectResponse self = new GetMqttConnectResponse();
        return TeaModel.build(map, self);
    }

    public GetMqttConnectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMqttConnectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMqttConnectResponse setBody(GetMqttConnectResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMqttConnectResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetDeviceShadowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDeviceShadowResponseBody body;

    public static GetDeviceShadowResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceShadowResponse self = new GetDeviceShadowResponse();
        return TeaModel.build(map, self);
    }

    public GetDeviceShadowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDeviceShadowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDeviceShadowResponse setBody(GetDeviceShadowResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDeviceShadowResponseBody getBody() {
        return this.body;
    }

}

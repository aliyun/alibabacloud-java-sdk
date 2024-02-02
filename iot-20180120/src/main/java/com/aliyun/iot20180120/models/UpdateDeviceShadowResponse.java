// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class UpdateDeviceShadowResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDeviceShadowResponseBody body;

    public static UpdateDeviceShadowResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeviceShadowResponse self = new UpdateDeviceShadowResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDeviceShadowResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDeviceShadowResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDeviceShadowResponse setBody(UpdateDeviceShadowResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDeviceShadowResponseBody getBody() {
        return this.body;
    }

}

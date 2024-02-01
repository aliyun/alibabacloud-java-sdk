// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class UpdateGbDeviceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateGbDeviceResponseBody body;

    public static UpdateGbDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateGbDeviceResponse self = new UpdateGbDeviceResponse();
        return TeaModel.build(map, self);
    }

    public UpdateGbDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateGbDeviceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateGbDeviceResponse setBody(UpdateGbDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateGbDeviceResponseBody getBody() {
        return this.body;
    }

}

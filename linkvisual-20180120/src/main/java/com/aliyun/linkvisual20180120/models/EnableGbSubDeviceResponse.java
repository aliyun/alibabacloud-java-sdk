// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class EnableGbSubDeviceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableGbSubDeviceResponseBody body;

    public static EnableGbSubDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableGbSubDeviceResponse self = new EnableGbSubDeviceResponse();
        return TeaModel.build(map, self);
    }

    public EnableGbSubDeviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableGbSubDeviceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableGbSubDeviceResponse setBody(EnableGbSubDeviceResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableGbSubDeviceResponseBody getBody() {
        return this.body;
    }

}

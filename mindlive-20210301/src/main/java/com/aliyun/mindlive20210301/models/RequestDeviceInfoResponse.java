// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mindlive20210301.models;

import com.aliyun.tea.*;

public class RequestDeviceInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RequestDeviceInfoResponseBody body;

    public static RequestDeviceInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        RequestDeviceInfoResponse self = new RequestDeviceInfoResponse();
        return TeaModel.build(map, self);
    }

    public RequestDeviceInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RequestDeviceInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RequestDeviceInfoResponse setBody(RequestDeviceInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public RequestDeviceInfoResponseBody getBody() {
        return this.body;
    }

}

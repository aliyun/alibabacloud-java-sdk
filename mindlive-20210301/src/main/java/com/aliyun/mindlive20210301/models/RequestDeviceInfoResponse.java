// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mindlive20210301.models;

import com.aliyun.tea.*;

public class RequestDeviceInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public RequestDeviceInfoResponse setBody(RequestDeviceInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public RequestDeviceInfoResponseBody getBody() {
        return this.body;
    }

}

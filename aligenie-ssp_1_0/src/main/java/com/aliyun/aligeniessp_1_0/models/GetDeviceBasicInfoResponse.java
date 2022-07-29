// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetDeviceBasicInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetDeviceBasicInfoResponseBody body;

    public static GetDeviceBasicInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceBasicInfoResponse self = new GetDeviceBasicInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetDeviceBasicInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDeviceBasicInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDeviceBasicInfoResponse setBody(GetDeviceBasicInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDeviceBasicInfoResponseBody getBody() {
        return this.body;
    }

}

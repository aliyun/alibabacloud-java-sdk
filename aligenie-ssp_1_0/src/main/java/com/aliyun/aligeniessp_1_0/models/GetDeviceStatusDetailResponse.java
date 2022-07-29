// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetDeviceStatusDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetDeviceStatusDetailResponseBody body;

    public static GetDeviceStatusDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceStatusDetailResponse self = new GetDeviceStatusDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetDeviceStatusDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDeviceStatusDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDeviceStatusDetailResponse setBody(GetDeviceStatusDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDeviceStatusDetailResponseBody getBody() {
        return this.body;
    }

}

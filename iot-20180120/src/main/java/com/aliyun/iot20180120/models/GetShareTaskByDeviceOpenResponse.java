// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetShareTaskByDeviceOpenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetShareTaskByDeviceOpenResponseBody body;

    public static GetShareTaskByDeviceOpenResponse build(java.util.Map<String, ?> map) throws Exception {
        GetShareTaskByDeviceOpenResponse self = new GetShareTaskByDeviceOpenResponse();
        return TeaModel.build(map, self);
    }

    public GetShareTaskByDeviceOpenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetShareTaskByDeviceOpenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetShareTaskByDeviceOpenResponse setBody(GetShareTaskByDeviceOpenResponseBody body) {
        this.body = body;
        return this;
    }
    public GetShareTaskByDeviceOpenResponseBody getBody() {
        return this.body;
    }

}

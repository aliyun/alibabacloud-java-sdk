// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class GetBasicAccelerateIpResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetBasicAccelerateIpResponseBody body;

    public static GetBasicAccelerateIpResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBasicAccelerateIpResponse self = new GetBasicAccelerateIpResponse();
        return TeaModel.build(map, self);
    }

    public GetBasicAccelerateIpResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBasicAccelerateIpResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBasicAccelerateIpResponse setBody(GetBasicAccelerateIpResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBasicAccelerateIpResponseBody getBody() {
        return this.body;
    }

}

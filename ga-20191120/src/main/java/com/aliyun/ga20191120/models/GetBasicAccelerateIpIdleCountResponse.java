// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class GetBasicAccelerateIpIdleCountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetBasicAccelerateIpIdleCountResponseBody body;

    public static GetBasicAccelerateIpIdleCountResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBasicAccelerateIpIdleCountResponse self = new GetBasicAccelerateIpIdleCountResponse();
        return TeaModel.build(map, self);
    }

    public GetBasicAccelerateIpIdleCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBasicAccelerateIpIdleCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBasicAccelerateIpIdleCountResponse setBody(GetBasicAccelerateIpIdleCountResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBasicAccelerateIpIdleCountResponseBody getBody() {
        return this.body;
    }

}

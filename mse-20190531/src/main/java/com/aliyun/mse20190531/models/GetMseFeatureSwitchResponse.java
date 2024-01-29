// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetMseFeatureSwitchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMseFeatureSwitchResponseBody body;

    public static GetMseFeatureSwitchResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMseFeatureSwitchResponse self = new GetMseFeatureSwitchResponse();
        return TeaModel.build(map, self);
    }

    public GetMseFeatureSwitchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMseFeatureSwitchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMseFeatureSwitchResponse setBody(GetMseFeatureSwitchResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMseFeatureSwitchResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetNacosConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetNacosConfigResponseBody body;

    public static GetNacosConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNacosConfigResponse self = new GetNacosConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetNacosConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetNacosConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetNacosConfigResponse setBody(GetNacosConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetNacosConfigResponseBody getBody() {
        return this.body;
    }

}

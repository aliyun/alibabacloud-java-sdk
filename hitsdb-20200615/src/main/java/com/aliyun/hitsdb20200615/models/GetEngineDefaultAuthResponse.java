// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class GetEngineDefaultAuthResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetEngineDefaultAuthResponseBody body;

    public static GetEngineDefaultAuthResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEngineDefaultAuthResponse self = new GetEngineDefaultAuthResponse();
        return TeaModel.build(map, self);
    }

    public GetEngineDefaultAuthResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEngineDefaultAuthResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEngineDefaultAuthResponse setBody(GetEngineDefaultAuthResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEngineDefaultAuthResponseBody getBody() {
        return this.body;
    }

}

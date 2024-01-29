// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetPluginsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPluginsResponseBody body;

    public static GetPluginsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPluginsResponse self = new GetPluginsResponse();
        return TeaModel.build(map, self);
    }

    public GetPluginsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPluginsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPluginsResponse setBody(GetPluginsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPluginsResponseBody getBody() {
        return this.body;
    }

}

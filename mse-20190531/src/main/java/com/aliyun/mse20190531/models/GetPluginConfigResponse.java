// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetPluginConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPluginConfigResponseBody body;

    public static GetPluginConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPluginConfigResponse self = new GetPluginConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetPluginConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPluginConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPluginConfigResponse setBody(GetPluginConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPluginConfigResponseBody getBody() {
        return this.body;
    }

}

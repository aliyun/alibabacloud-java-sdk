// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetClientConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetClientConfigResponseBody body;

    public static GetClientConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetClientConfigResponse self = new GetClientConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetClientConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetClientConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetClientConfigResponse setBody(GetClientConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetClientConfigResponseBody getBody() {
        return this.body;
    }

}

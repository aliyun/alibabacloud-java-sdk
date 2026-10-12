// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetApiPathFieldConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetApiPathFieldConfigResponseBody body;

    public static GetApiPathFieldConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetApiPathFieldConfigResponse self = new GetApiPathFieldConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetApiPathFieldConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetApiPathFieldConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetApiPathFieldConfigResponse setBody(GetApiPathFieldConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetApiPathFieldConfigResponseBody getBody() {
        return this.body;
    }

}

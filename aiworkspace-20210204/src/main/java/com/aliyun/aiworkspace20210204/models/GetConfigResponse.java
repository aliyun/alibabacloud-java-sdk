// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class GetConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetConfigResponseBody body;

    public static GetConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetConfigResponse self = new GetConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetConfigResponse setBody(GetConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetConfigResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appflow20230904.models;

import com.aliyun.tea.*;

public class GetUserAuthConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetUserAuthConfigResponseBody body;

    public static GetUserAuthConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserAuthConfigResponse self = new GetUserAuthConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetUserAuthConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserAuthConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUserAuthConfigResponse setBody(GetUserAuthConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserAuthConfigResponseBody getBody() {
        return this.body;
    }

}

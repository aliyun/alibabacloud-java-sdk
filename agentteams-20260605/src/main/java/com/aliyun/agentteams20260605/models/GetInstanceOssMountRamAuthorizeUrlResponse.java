// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class GetInstanceOssMountRamAuthorizeUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetInstanceOssMountRamAuthorizeUrlResponseBody body;

    public static GetInstanceOssMountRamAuthorizeUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceOssMountRamAuthorizeUrlResponse self = new GetInstanceOssMountRamAuthorizeUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceOssMountRamAuthorizeUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceOssMountRamAuthorizeUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetInstanceOssMountRamAuthorizeUrlResponse setBody(GetInstanceOssMountRamAuthorizeUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceOssMountRamAuthorizeUrlResponseBody getBody() {
        return this.body;
    }

}

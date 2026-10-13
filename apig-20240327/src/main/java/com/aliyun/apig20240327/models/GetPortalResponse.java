// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetPortalResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPortalResponseBody body;

    public static GetPortalResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPortalResponse self = new GetPortalResponse();
        return TeaModel.build(map, self);
    }

    public GetPortalResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPortalResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPortalResponse setBody(GetPortalResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPortalResponseBody getBody() {
        return this.body;
    }

}

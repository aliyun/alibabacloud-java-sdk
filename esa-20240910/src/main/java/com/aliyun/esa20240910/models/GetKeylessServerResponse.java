// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetKeylessServerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetKeylessServerResponseBody body;

    public static GetKeylessServerResponse build(java.util.Map<String, ?> map) throws Exception {
        GetKeylessServerResponse self = new GetKeylessServerResponse();
        return TeaModel.build(map, self);
    }

    public GetKeylessServerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetKeylessServerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetKeylessServerResponse setBody(GetKeylessServerResponseBody body) {
        this.body = body;
        return this;
    }
    public GetKeylessServerResponseBody getBody() {
        return this.body;
    }

}

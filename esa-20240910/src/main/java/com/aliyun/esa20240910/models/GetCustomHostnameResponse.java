// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetCustomHostnameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCustomHostnameResponseBody body;

    public static GetCustomHostnameResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCustomHostnameResponse self = new GetCustomHostnameResponse();
        return TeaModel.build(map, self);
    }

    public GetCustomHostnameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCustomHostnameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCustomHostnameResponse setBody(GetCustomHostnameResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCustomHostnameResponseBody getBody() {
        return this.body;
    }

}

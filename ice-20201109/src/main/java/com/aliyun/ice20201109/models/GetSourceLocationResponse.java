// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetSourceLocationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSourceLocationResponseBody body;

    public static GetSourceLocationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSourceLocationResponse self = new GetSourceLocationResponse();
        return TeaModel.build(map, self);
    }

    public GetSourceLocationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSourceLocationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSourceLocationResponse setBody(GetSourceLocationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSourceLocationResponseBody getBody() {
        return this.body;
    }

}

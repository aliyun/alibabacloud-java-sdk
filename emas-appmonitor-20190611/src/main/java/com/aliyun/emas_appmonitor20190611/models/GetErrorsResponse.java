// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_appmonitor20190611.models;

import com.aliyun.tea.*;

public class GetErrorsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetErrorsResponseBody body;

    public static GetErrorsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetErrorsResponse self = new GetErrorsResponse();
        return TeaModel.build(map, self);
    }

    public GetErrorsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetErrorsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetErrorsResponse setBody(GetErrorsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetErrorsResponseBody getBody() {
        return this.body;
    }

}

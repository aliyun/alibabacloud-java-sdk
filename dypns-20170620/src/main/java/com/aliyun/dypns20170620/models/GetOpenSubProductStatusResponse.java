// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypns20170620.models;

import com.aliyun.tea.*;

public class GetOpenSubProductStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetOpenSubProductStatusResponseBody body;

    public static GetOpenSubProductStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOpenSubProductStatusResponse self = new GetOpenSubProductStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetOpenSubProductStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOpenSubProductStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOpenSubProductStatusResponse setBody(GetOpenSubProductStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOpenSubProductStatusResponseBody getBody() {
        return this.body;
    }

}

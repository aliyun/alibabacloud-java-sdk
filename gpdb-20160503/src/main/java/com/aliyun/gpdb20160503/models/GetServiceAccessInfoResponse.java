// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class GetServiceAccessInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetServiceAccessInfoResponseBody body;

    public static GetServiceAccessInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetServiceAccessInfoResponse self = new GetServiceAccessInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetServiceAccessInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetServiceAccessInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetServiceAccessInfoResponse setBody(GetServiceAccessInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetServiceAccessInfoResponseBody getBody() {
        return this.body;
    }

}

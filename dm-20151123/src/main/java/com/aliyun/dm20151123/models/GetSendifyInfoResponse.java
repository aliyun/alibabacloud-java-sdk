// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class GetSendifyInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSendifyInfoResponseBody body;

    public static GetSendifyInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSendifyInfoResponse self = new GetSendifyInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetSendifyInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSendifyInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSendifyInfoResponse setBody(GetSendifyInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSendifyInfoResponseBody getBody() {
        return this.body;
    }

}

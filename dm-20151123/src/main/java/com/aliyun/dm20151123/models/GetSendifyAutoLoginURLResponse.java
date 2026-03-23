// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class GetSendifyAutoLoginURLResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSendifyAutoLoginURLResponseBody body;

    public static GetSendifyAutoLoginURLResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSendifyAutoLoginURLResponse self = new GetSendifyAutoLoginURLResponse();
        return TeaModel.build(map, self);
    }

    public GetSendifyAutoLoginURLResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSendifyAutoLoginURLResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSendifyAutoLoginURLResponse setBody(GetSendifyAutoLoginURLResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSendifyAutoLoginURLResponseBody getBody() {
        return this.body;
    }

}

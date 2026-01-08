// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class GetViberByRequestNoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetViberByRequestNoResponseBody body;

    public static GetViberByRequestNoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetViberByRequestNoResponse self = new GetViberByRequestNoResponse();
        return TeaModel.build(map, self);
    }

    public GetViberByRequestNoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetViberByRequestNoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetViberByRequestNoResponse setBody(GetViberByRequestNoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetViberByRequestNoResponseBody getBody() {
        return this.body;
    }

}

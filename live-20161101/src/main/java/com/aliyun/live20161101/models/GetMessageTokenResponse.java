// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class GetMessageTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetMessageTokenResponseBody body;

    public static GetMessageTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMessageTokenResponse self = new GetMessageTokenResponse();
        return TeaModel.build(map, self);
    }

    public GetMessageTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMessageTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetMessageTokenResponse setBody(GetMessageTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMessageTokenResponseBody getBody() {
        return this.body;
    }

}

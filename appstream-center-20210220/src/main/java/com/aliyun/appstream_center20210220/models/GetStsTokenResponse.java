// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210220.models;

import com.aliyun.tea.*;

public class GetStsTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetStsTokenResponseBody body;

    public static GetStsTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        GetStsTokenResponse self = new GetStsTokenResponse();
        return TeaModel.build(map, self);
    }

    public GetStsTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetStsTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetStsTokenResponse setBody(GetStsTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public GetStsTokenResponseBody getBody() {
        return this.body;
    }

}

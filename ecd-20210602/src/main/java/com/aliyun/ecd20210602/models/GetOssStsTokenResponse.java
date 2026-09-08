// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class GetOssStsTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetOssStsTokenResponseBody body;

    public static GetOssStsTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOssStsTokenResponse self = new GetOssStsTokenResponse();
        return TeaModel.build(map, self);
    }

    public GetOssStsTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOssStsTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOssStsTokenResponse setBody(GetOssStsTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOssStsTokenResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210218.models;

import com.aliyun.tea.*;

public class GetLatestThirdAppAccessTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLatestThirdAppAccessTokenResponseBody body;

    public static GetLatestThirdAppAccessTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLatestThirdAppAccessTokenResponse self = new GetLatestThirdAppAccessTokenResponse();
        return TeaModel.build(map, self);
    }

    public GetLatestThirdAppAccessTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLatestThirdAppAccessTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLatestThirdAppAccessTokenResponse setBody(GetLatestThirdAppAccessTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLatestThirdAppAccessTokenResponseBody getBody() {
        return this.body;
    }

}

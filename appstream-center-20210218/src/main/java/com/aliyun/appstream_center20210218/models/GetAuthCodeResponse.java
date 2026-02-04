// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210218.models;

import com.aliyun.tea.*;

public class GetAuthCodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAuthCodeResponseBody body;

    public static GetAuthCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAuthCodeResponse self = new GetAuthCodeResponse();
        return TeaModel.build(map, self);
    }

    public GetAuthCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAuthCodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAuthCodeResponse setBody(GetAuthCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAuthCodeResponseBody getBody() {
        return this.body;
    }

}

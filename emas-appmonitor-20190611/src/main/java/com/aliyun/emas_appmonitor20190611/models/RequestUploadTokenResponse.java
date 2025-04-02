// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_appmonitor20190611.models;

import com.aliyun.tea.*;

public class RequestUploadTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RequestUploadTokenResponseBody body;

    public static RequestUploadTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        RequestUploadTokenResponse self = new RequestUploadTokenResponse();
        return TeaModel.build(map, self);
    }

    public RequestUploadTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RequestUploadTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RequestUploadTokenResponse setBody(RequestUploadTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public RequestUploadTokenResponseBody getBody() {
        return this.body;
    }

}

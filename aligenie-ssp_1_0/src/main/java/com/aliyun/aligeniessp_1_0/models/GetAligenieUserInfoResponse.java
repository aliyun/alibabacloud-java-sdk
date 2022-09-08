// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetAligenieUserInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetAligenieUserInfoResponseBody body;

    public static GetAligenieUserInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAligenieUserInfoResponse self = new GetAligenieUserInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetAligenieUserInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAligenieUserInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAligenieUserInfoResponse setBody(GetAligenieUserInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAligenieUserInfoResponseBody getBody() {
        return this.body;
    }

}

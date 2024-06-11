// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class GetAdbSecureResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAdbSecureResponseBody body;

    public static GetAdbSecureResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAdbSecureResponse self = new GetAdbSecureResponse();
        return TeaModel.build(map, self);
    }

    public GetAdbSecureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAdbSecureResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAdbSecureResponse setBody(GetAdbSecureResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAdbSecureResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class SetAdbSecureResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetAdbSecureResponseBody body;

    public static SetAdbSecureResponse build(java.util.Map<String, ?> map) throws Exception {
        SetAdbSecureResponse self = new SetAdbSecureResponse();
        return TeaModel.build(map, self);
    }

    public SetAdbSecureResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetAdbSecureResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetAdbSecureResponse setBody(SetAdbSecureResponseBody body) {
        this.body = body;
        return this;
    }
    public SetAdbSecureResponseBody getBody() {
        return this.body;
    }

}

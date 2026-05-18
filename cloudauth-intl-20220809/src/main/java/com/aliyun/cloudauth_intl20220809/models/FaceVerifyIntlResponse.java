// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class FaceVerifyIntlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FaceVerifyIntlResponseBody body;

    public static FaceVerifyIntlResponse build(java.util.Map<String, ?> map) throws Exception {
        FaceVerifyIntlResponse self = new FaceVerifyIntlResponse();
        return TeaModel.build(map, self);
    }

    public FaceVerifyIntlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FaceVerifyIntlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FaceVerifyIntlResponse setBody(FaceVerifyIntlResponseBody body) {
        this.body = body;
        return this;
    }
    public FaceVerifyIntlResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubYikeUserCreditResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SubYikeUserCreditResponseBody body;

    public static SubYikeUserCreditResponse build(java.util.Map<String, ?> map) throws Exception {
        SubYikeUserCreditResponse self = new SubYikeUserCreditResponse();
        return TeaModel.build(map, self);
    }

    public SubYikeUserCreditResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubYikeUserCreditResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubYikeUserCreditResponse setBody(SubYikeUserCreditResponseBody body) {
        this.body = body;
        return this;
    }
    public SubYikeUserCreditResponseBody getBody() {
        return this.body;
    }

}

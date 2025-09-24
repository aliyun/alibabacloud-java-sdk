// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class FaceDuplicationCheckIntlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FaceDuplicationCheckIntlResponseBody body;

    public static FaceDuplicationCheckIntlResponse build(java.util.Map<String, ?> map) throws Exception {
        FaceDuplicationCheckIntlResponse self = new FaceDuplicationCheckIntlResponse();
        return TeaModel.build(map, self);
    }

    public FaceDuplicationCheckIntlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FaceDuplicationCheckIntlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FaceDuplicationCheckIntlResponse setBody(FaceDuplicationCheckIntlResponseBody body) {
        this.body = body;
        return this;
    }
    public FaceDuplicationCheckIntlResponseBody getBody() {
        return this.body;
    }

}

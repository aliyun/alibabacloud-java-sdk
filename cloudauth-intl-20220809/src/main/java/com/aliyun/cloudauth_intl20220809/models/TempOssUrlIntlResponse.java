// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class TempOssUrlIntlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TempOssUrlIntlResponseBody body;

    public static TempOssUrlIntlResponse build(java.util.Map<String, ?> map) throws Exception {
        TempOssUrlIntlResponse self = new TempOssUrlIntlResponse();
        return TeaModel.build(map, self);
    }

    public TempOssUrlIntlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TempOssUrlIntlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TempOssUrlIntlResponse setBody(TempOssUrlIntlResponseBody body) {
        this.body = body;
        return this;
    }
    public TempOssUrlIntlResponseBody getBody() {
        return this.body;
    }

}

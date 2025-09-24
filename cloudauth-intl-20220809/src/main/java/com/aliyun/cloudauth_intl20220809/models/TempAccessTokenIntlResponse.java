// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class TempAccessTokenIntlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TempAccessTokenIntlResponseBody body;

    public static TempAccessTokenIntlResponse build(java.util.Map<String, ?> map) throws Exception {
        TempAccessTokenIntlResponse self = new TempAccessTokenIntlResponse();
        return TeaModel.build(map, self);
    }

    public TempAccessTokenIntlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TempAccessTokenIntlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TempAccessTokenIntlResponse setBody(TempAccessTokenIntlResponseBody body) {
        this.body = body;
        return this;
    }
    public TempAccessTokenIntlResponseBody getBody() {
        return this.body;
    }

}

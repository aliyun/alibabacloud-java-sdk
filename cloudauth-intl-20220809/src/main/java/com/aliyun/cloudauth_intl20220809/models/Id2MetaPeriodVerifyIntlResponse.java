// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class Id2MetaPeriodVerifyIntlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public Id2MetaPeriodVerifyIntlResponseBody body;

    public static Id2MetaPeriodVerifyIntlResponse build(java.util.Map<String, ?> map) throws Exception {
        Id2MetaPeriodVerifyIntlResponse self = new Id2MetaPeriodVerifyIntlResponse();
        return TeaModel.build(map, self);
    }

    public Id2MetaPeriodVerifyIntlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public Id2MetaPeriodVerifyIntlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public Id2MetaPeriodVerifyIntlResponse setBody(Id2MetaPeriodVerifyIntlResponseBody body) {
        this.body = body;
        return this;
    }
    public Id2MetaPeriodVerifyIntlResponseBody getBody() {
        return this.body;
    }

}

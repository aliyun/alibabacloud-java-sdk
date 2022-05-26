// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class ForbiddenAgAccountLoginResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ForbiddenAgAccountLoginResponseBody body;

    public static ForbiddenAgAccountLoginResponse build(java.util.Map<String, ?> map) throws Exception {
        ForbiddenAgAccountLoginResponse self = new ForbiddenAgAccountLoginResponse();
        return TeaModel.build(map, self);
    }

    public ForbiddenAgAccountLoginResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ForbiddenAgAccountLoginResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ForbiddenAgAccountLoginResponse setBody(ForbiddenAgAccountLoginResponseBody body) {
        this.body = body;
        return this;
    }
    public ForbiddenAgAccountLoginResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class SaveUserCreditResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SaveUserCreditResponseBody body;

    public static SaveUserCreditResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveUserCreditResponse self = new SaveUserCreditResponse();
        return TeaModel.build(map, self);
    }

    public SaveUserCreditResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveUserCreditResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveUserCreditResponse setBody(SaveUserCreditResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveUserCreditResponseBody getBody() {
        return this.body;
    }

}

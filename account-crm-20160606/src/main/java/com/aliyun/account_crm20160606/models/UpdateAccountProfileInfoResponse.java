// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class UpdateAccountProfileInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateAccountProfileInfoResponseBody body;

    public static UpdateAccountProfileInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAccountProfileInfoResponse self = new UpdateAccountProfileInfoResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAccountProfileInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAccountProfileInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAccountProfileInfoResponse setBody(UpdateAccountProfileInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAccountProfileInfoResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class UpdateAccountAddressInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateAccountAddressInfoResponseBody body;

    public static UpdateAccountAddressInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAccountAddressInfoResponse self = new UpdateAccountAddressInfoResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAccountAddressInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAccountAddressInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAccountAddressInfoResponse setBody(UpdateAccountAddressInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAccountAddressInfoResponseBody getBody() {
        return this.body;
    }

}

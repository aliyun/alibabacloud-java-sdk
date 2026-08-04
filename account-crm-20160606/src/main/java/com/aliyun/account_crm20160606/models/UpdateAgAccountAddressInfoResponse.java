// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class UpdateAgAccountAddressInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateAgAccountAddressInfoResponseBody body;

    public static UpdateAgAccountAddressInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAgAccountAddressInfoResponse self = new UpdateAgAccountAddressInfoResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAgAccountAddressInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAgAccountAddressInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAgAccountAddressInfoResponse setBody(UpdateAgAccountAddressInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAgAccountAddressInfoResponseBody getBody() {
        return this.body;
    }

}

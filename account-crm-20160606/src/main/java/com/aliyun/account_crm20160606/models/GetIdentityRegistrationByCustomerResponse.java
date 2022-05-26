// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class GetIdentityRegistrationByCustomerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetIdentityRegistrationByCustomerResponseBody body;

    public static GetIdentityRegistrationByCustomerResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIdentityRegistrationByCustomerResponse self = new GetIdentityRegistrationByCustomerResponse();
        return TeaModel.build(map, self);
    }

    public GetIdentityRegistrationByCustomerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetIdentityRegistrationByCustomerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetIdentityRegistrationByCustomerResponse setBody(GetIdentityRegistrationByCustomerResponseBody body) {
        this.body = body;
        return this;
    }
    public GetIdentityRegistrationByCustomerResponseBody getBody() {
        return this.body;
    }

}

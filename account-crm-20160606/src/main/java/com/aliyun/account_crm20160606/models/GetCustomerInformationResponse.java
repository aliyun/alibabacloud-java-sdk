// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class GetCustomerInformationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetCustomerInformationResponseBody body;

    public static GetCustomerInformationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCustomerInformationResponse self = new GetCustomerInformationResponse();
        return TeaModel.build(map, self);
    }

    public GetCustomerInformationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCustomerInformationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCustomerInformationResponse setBody(GetCustomerInformationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCustomerInformationResponseBody getBody() {
        return this.body;
    }

}

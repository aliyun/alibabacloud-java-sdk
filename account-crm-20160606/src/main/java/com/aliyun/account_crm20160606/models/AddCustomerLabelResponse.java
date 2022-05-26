// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class AddCustomerLabelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public AddCustomerLabelResponseBody body;

    public static AddCustomerLabelResponse build(java.util.Map<String, ?> map) throws Exception {
        AddCustomerLabelResponse self = new AddCustomerLabelResponse();
        return TeaModel.build(map, self);
    }

    public AddCustomerLabelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddCustomerLabelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddCustomerLabelResponse setBody(AddCustomerLabelResponseBody body) {
        this.body = body;
        return this;
    }
    public AddCustomerLabelResponseBody getBody() {
        return this.body;
    }

}

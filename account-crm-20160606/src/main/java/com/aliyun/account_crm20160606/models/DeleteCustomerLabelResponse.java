// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class DeleteCustomerLabelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteCustomerLabelResponseBody body;

    public static DeleteCustomerLabelResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomerLabelResponse self = new DeleteCustomerLabelResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCustomerLabelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCustomerLabelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCustomerLabelResponse setBody(DeleteCustomerLabelResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCustomerLabelResponseBody getBody() {
        return this.body;
    }

}

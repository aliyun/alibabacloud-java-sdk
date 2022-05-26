// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class UpdateCustomerCategoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateCustomerCategoryResponseBody body;

    public static UpdateCustomerCategoryResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCustomerCategoryResponse self = new UpdateCustomerCategoryResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCustomerCategoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCustomerCategoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCustomerCategoryResponse setBody(UpdateCustomerCategoryResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCustomerCategoryResponseBody getBody() {
        return this.body;
    }

}

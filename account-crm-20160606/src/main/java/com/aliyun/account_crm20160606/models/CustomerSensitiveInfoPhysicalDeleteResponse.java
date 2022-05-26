// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class CustomerSensitiveInfoPhysicalDeleteResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CustomerSensitiveInfoPhysicalDeleteResponseBody body;

    public static CustomerSensitiveInfoPhysicalDeleteResponse build(java.util.Map<String, ?> map) throws Exception {
        CustomerSensitiveInfoPhysicalDeleteResponse self = new CustomerSensitiveInfoPhysicalDeleteResponse();
        return TeaModel.build(map, self);
    }

    public CustomerSensitiveInfoPhysicalDeleteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CustomerSensitiveInfoPhysicalDeleteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CustomerSensitiveInfoPhysicalDeleteResponse setBody(CustomerSensitiveInfoPhysicalDeleteResponseBody body) {
        this.body = body;
        return this;
    }
    public CustomerSensitiveInfoPhysicalDeleteResponseBody getBody() {
        return this.body;
    }

}

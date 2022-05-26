// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class CustomerSensitiveInfoLogicalDeleteResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CustomerSensitiveInfoLogicalDeleteResponseBody body;

    public static CustomerSensitiveInfoLogicalDeleteResponse build(java.util.Map<String, ?> map) throws Exception {
        CustomerSensitiveInfoLogicalDeleteResponse self = new CustomerSensitiveInfoLogicalDeleteResponse();
        return TeaModel.build(map, self);
    }

    public CustomerSensitiveInfoLogicalDeleteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CustomerSensitiveInfoLogicalDeleteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CustomerSensitiveInfoLogicalDeleteResponse setBody(CustomerSensitiveInfoLogicalDeleteResponseBody body) {
        this.body = body;
        return this;
    }
    public CustomerSensitiveInfoLogicalDeleteResponseBody getBody() {
        return this.body;
    }

}

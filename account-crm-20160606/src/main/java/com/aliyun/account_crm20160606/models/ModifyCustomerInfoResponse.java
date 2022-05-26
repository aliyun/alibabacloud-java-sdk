// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class ModifyCustomerInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyCustomerInfoResponseBody body;

    public static ModifyCustomerInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyCustomerInfoResponse self = new ModifyCustomerInfoResponse();
        return TeaModel.build(map, self);
    }

    public ModifyCustomerInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyCustomerInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyCustomerInfoResponse setBody(ModifyCustomerInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyCustomerInfoResponseBody getBody() {
        return this.body;
    }

}

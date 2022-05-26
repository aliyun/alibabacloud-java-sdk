// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class FindCustomerInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public FindCustomerInfoResponseBody body;

    public static FindCustomerInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        FindCustomerInfoResponse self = new FindCustomerInfoResponse();
        return TeaModel.build(map, self);
    }

    public FindCustomerInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FindCustomerInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FindCustomerInfoResponse setBody(FindCustomerInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public FindCustomerInfoResponseBody getBody() {
        return this.body;
    }

}

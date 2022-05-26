// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class FindFinanceTaxResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public FindFinanceTaxResponseBody body;

    public static FindFinanceTaxResponse build(java.util.Map<String, ?> map) throws Exception {
        FindFinanceTaxResponse self = new FindFinanceTaxResponse();
        return TeaModel.build(map, self);
    }

    public FindFinanceTaxResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FindFinanceTaxResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FindFinanceTaxResponse setBody(FindFinanceTaxResponseBody body) {
        this.body = body;
        return this;
    }
    public FindFinanceTaxResponseBody getBody() {
        return this.body;
    }

}

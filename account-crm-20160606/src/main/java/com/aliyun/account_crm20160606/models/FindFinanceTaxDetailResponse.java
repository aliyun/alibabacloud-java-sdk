// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class FindFinanceTaxDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public FindFinanceTaxDetailResponseBody body;

    public static FindFinanceTaxDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        FindFinanceTaxDetailResponse self = new FindFinanceTaxDetailResponse();
        return TeaModel.build(map, self);
    }

    public FindFinanceTaxDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FindFinanceTaxDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FindFinanceTaxDetailResponse setBody(FindFinanceTaxDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public FindFinanceTaxDetailResponseBody getBody() {
        return this.body;
    }

}

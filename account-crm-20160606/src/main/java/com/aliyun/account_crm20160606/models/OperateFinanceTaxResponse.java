// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class OperateFinanceTaxResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public OperateFinanceTaxResponseBody body;

    public static OperateFinanceTaxResponse build(java.util.Map<String, ?> map) throws Exception {
        OperateFinanceTaxResponse self = new OperateFinanceTaxResponse();
        return TeaModel.build(map, self);
    }

    public OperateFinanceTaxResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OperateFinanceTaxResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OperateFinanceTaxResponse setBody(OperateFinanceTaxResponseBody body) {
        this.body = body;
        return this;
    }
    public OperateFinanceTaxResponseBody getBody() {
        return this.body;
    }

}

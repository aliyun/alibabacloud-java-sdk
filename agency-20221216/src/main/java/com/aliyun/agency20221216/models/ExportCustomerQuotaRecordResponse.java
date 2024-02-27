// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class ExportCustomerQuotaRecordResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExportCustomerQuotaRecordResponseBody body;

    public static ExportCustomerQuotaRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportCustomerQuotaRecordResponse self = new ExportCustomerQuotaRecordResponse();
        return TeaModel.build(map, self);
    }

    public ExportCustomerQuotaRecordResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportCustomerQuotaRecordResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExportCustomerQuotaRecordResponse setBody(ExportCustomerQuotaRecordResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportCustomerQuotaRecordResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216.models;

import com.aliyun.tea.*;

public class CustomerQuotaRecordListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CustomerQuotaRecordListResponseBody body;

    public static CustomerQuotaRecordListResponse build(java.util.Map<String, ?> map) throws Exception {
        CustomerQuotaRecordListResponse self = new CustomerQuotaRecordListResponse();
        return TeaModel.build(map, self);
    }

    public CustomerQuotaRecordListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CustomerQuotaRecordListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CustomerQuotaRecordListResponse setBody(CustomerQuotaRecordListResponseBody body) {
        this.body = body;
        return this;
    }
    public CustomerQuotaRecordListResponseBody getBody() {
        return this.body;
    }

}

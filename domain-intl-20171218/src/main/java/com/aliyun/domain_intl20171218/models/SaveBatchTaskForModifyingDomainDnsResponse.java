// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class SaveBatchTaskForModifyingDomainDnsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveBatchTaskForModifyingDomainDnsResponseBody body;

    public static SaveBatchTaskForModifyingDomainDnsResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveBatchTaskForModifyingDomainDnsResponse self = new SaveBatchTaskForModifyingDomainDnsResponse();
        return TeaModel.build(map, self);
    }

    public SaveBatchTaskForModifyingDomainDnsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveBatchTaskForModifyingDomainDnsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveBatchTaskForModifyingDomainDnsResponse setBody(SaveBatchTaskForModifyingDomainDnsResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveBatchTaskForModifyingDomainDnsResponseBody getBody() {
        return this.body;
    }

}

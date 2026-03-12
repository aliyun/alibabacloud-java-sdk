// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20160511.models;

import com.aliyun.tea.*;

public class SaveTaskForModifyingDomainDnsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveTaskForModifyingDomainDnsResponseBody body;

    public static SaveTaskForModifyingDomainDnsResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveTaskForModifyingDomainDnsResponse self = new SaveTaskForModifyingDomainDnsResponse();
        return TeaModel.build(map, self);
    }

    public SaveTaskForModifyingDomainDnsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveTaskForModifyingDomainDnsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveTaskForModifyingDomainDnsResponse setBody(SaveTaskForModifyingDomainDnsResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveTaskForModifyingDomainDnsResponseBody getBody() {
        return this.body;
    }

}

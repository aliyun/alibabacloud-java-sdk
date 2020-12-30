// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveBatchTaskForModifyingDomainDnsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public SaveBatchTaskForModifyingDomainDnsResponse setBody(SaveBatchTaskForModifyingDomainDnsResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveBatchTaskForModifyingDomainDnsResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveBatchTaskForReserveDropListDomainResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SaveBatchTaskForReserveDropListDomainResponseBody body;

    public static SaveBatchTaskForReserveDropListDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveBatchTaskForReserveDropListDomainResponse self = new SaveBatchTaskForReserveDropListDomainResponse();
        return TeaModel.build(map, self);
    }

    public SaveBatchTaskForReserveDropListDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveBatchTaskForReserveDropListDomainResponse setBody(SaveBatchTaskForReserveDropListDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveBatchTaskForReserveDropListDomainResponseBody getBody() {
        return this.body;
    }

}

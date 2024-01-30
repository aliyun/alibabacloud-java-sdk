// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain_intl20171218.models;

import com.aliyun.tea.*;

public class SaveBatchTaskForReserveDropListDomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public SaveBatchTaskForReserveDropListDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveBatchTaskForReserveDropListDomainResponse setBody(SaveBatchTaskForReserveDropListDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveBatchTaskForReserveDropListDomainResponseBody getBody() {
        return this.body;
    }

}

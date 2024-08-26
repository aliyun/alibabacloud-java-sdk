// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class SaveSingleTaskForReserveDropListDomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveSingleTaskForReserveDropListDomainResponseBody body;

    public static SaveSingleTaskForReserveDropListDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveSingleTaskForReserveDropListDomainResponse self = new SaveSingleTaskForReserveDropListDomainResponse();
        return TeaModel.build(map, self);
    }

    public SaveSingleTaskForReserveDropListDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveSingleTaskForReserveDropListDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveSingleTaskForReserveDropListDomainResponse setBody(SaveSingleTaskForReserveDropListDomainResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveSingleTaskForReserveDropListDomainResponseBody getBody() {
        return this.body;
    }

}

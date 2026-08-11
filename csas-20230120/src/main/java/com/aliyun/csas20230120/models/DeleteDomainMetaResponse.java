// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class DeleteDomainMetaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDomainMetaResponseBody body;

    public static DeleteDomainMetaResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDomainMetaResponse self = new DeleteDomainMetaResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDomainMetaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDomainMetaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDomainMetaResponse setBody(DeleteDomainMetaResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDomainMetaResponseBody getBody() {
        return this.body;
    }

}

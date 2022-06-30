// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DeleteDomainResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDomainResourceResponseBody body;

    public static DeleteDomainResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDomainResourceResponse self = new DeleteDomainResourceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDomainResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDomainResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDomainResourceResponse setBody(DeleteDomainResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDomainResourceResponseBody getBody() {
        return this.body;
    }

}

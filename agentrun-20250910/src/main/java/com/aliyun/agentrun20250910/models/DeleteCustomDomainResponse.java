// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class DeleteCustomDomainResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CustomDomainResult body;

    public static DeleteCustomDomainResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCustomDomainResponse self = new DeleteCustomDomainResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCustomDomainResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCustomDomainResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCustomDomainResponse setBody(CustomDomainResult body) {
        this.body = body;
        return this;
    }
    public CustomDomainResult getBody() {
        return this.body;
    }

}

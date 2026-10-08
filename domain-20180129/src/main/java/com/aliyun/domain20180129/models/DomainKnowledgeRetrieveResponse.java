// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class DomainKnowledgeRetrieveResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DomainKnowledgeRetrieveResponseBody body;

    public static DomainKnowledgeRetrieveResponse build(java.util.Map<String, ?> map) throws Exception {
        DomainKnowledgeRetrieveResponse self = new DomainKnowledgeRetrieveResponse();
        return TeaModel.build(map, self);
    }

    public DomainKnowledgeRetrieveResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DomainKnowledgeRetrieveResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DomainKnowledgeRetrieveResponse setBody(DomainKnowledgeRetrieveResponseBody body) {
        this.body = body;
        return this;
    }
    public DomainKnowledgeRetrieveResponseBody getBody() {
        return this.body;
    }

}

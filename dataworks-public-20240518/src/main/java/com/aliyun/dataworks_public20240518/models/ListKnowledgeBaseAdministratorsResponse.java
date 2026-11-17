// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListKnowledgeBaseAdministratorsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListKnowledgeBaseAdministratorsResponseBody body;

    public static ListKnowledgeBaseAdministratorsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListKnowledgeBaseAdministratorsResponse self = new ListKnowledgeBaseAdministratorsResponse();
        return TeaModel.build(map, self);
    }

    public ListKnowledgeBaseAdministratorsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListKnowledgeBaseAdministratorsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListKnowledgeBaseAdministratorsResponse setBody(ListKnowledgeBaseAdministratorsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListKnowledgeBaseAdministratorsResponseBody getBody() {
        return this.body;
    }

}

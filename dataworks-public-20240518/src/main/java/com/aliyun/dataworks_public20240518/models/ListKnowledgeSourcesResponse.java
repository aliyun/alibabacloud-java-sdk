// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListKnowledgeSourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListKnowledgeSourcesResponseBody body;

    public static ListKnowledgeSourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListKnowledgeSourcesResponse self = new ListKnowledgeSourcesResponse();
        return TeaModel.build(map, self);
    }

    public ListKnowledgeSourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListKnowledgeSourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListKnowledgeSourcesResponse setBody(ListKnowledgeSourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListKnowledgeSourcesResponseBody getBody() {
        return this.body;
    }

}

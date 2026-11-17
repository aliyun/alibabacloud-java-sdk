// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListKnowledgeObjectsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListKnowledgeObjectsResponseBody body;

    public static ListKnowledgeObjectsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListKnowledgeObjectsResponse self = new ListKnowledgeObjectsResponse();
        return TeaModel.build(map, self);
    }

    public ListKnowledgeObjectsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListKnowledgeObjectsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListKnowledgeObjectsResponse setBody(ListKnowledgeObjectsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListKnowledgeObjectsResponseBody getBody() {
        return this.body;
    }

}

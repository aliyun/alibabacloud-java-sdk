// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ListKnowledgeTagsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListKnowledgeTagsResponseBody body;

    public static ListKnowledgeTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListKnowledgeTagsResponse self = new ListKnowledgeTagsResponse();
        return TeaModel.build(map, self);
    }

    public ListKnowledgeTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListKnowledgeTagsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListKnowledgeTagsResponse setBody(ListKnowledgeTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListKnowledgeTagsResponseBody getBody() {
        return this.body;
    }

}

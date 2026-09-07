// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class RemoveKnowledgeTagsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveKnowledgeTagsResponseBody body;

    public static RemoveKnowledgeTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveKnowledgeTagsResponse self = new RemoveKnowledgeTagsResponse();
        return TeaModel.build(map, self);
    }

    public RemoveKnowledgeTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveKnowledgeTagsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveKnowledgeTagsResponse setBody(RemoveKnowledgeTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveKnowledgeTagsResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class AddKnowledgeTagsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddKnowledgeTagsResponseBody body;

    public static AddKnowledgeTagsResponse build(java.util.Map<String, ?> map) throws Exception {
        AddKnowledgeTagsResponse self = new AddKnowledgeTagsResponse();
        return TeaModel.build(map, self);
    }

    public AddKnowledgeTagsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddKnowledgeTagsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddKnowledgeTagsResponse setBody(AddKnowledgeTagsResponseBody body) {
        this.body = body;
        return this;
    }
    public AddKnowledgeTagsResponseBody getBody() {
        return this.body;
    }

}

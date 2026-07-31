// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class AddKnowledgeFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddKnowledgeFileResponseBody body;

    public static AddKnowledgeFileResponse build(java.util.Map<String, ?> map) throws Exception {
        AddKnowledgeFileResponse self = new AddKnowledgeFileResponse();
        return TeaModel.build(map, self);
    }

    public AddKnowledgeFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddKnowledgeFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddKnowledgeFileResponse setBody(AddKnowledgeFileResponseBody body) {
        this.body = body;
        return this;
    }
    public AddKnowledgeFileResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class RemoveKnowledgeUploadUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveKnowledgeUploadUserResponseBody body;

    public static RemoveKnowledgeUploadUserResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveKnowledgeUploadUserResponse self = new RemoveKnowledgeUploadUserResponse();
        return TeaModel.build(map, self);
    }

    public RemoveKnowledgeUploadUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveKnowledgeUploadUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveKnowledgeUploadUserResponse setBody(RemoveKnowledgeUploadUserResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveKnowledgeUploadUserResponseBody getBody() {
        return this.body;
    }

}

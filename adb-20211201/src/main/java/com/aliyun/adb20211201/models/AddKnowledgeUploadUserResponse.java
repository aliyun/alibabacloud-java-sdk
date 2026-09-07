// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class AddKnowledgeUploadUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddKnowledgeUploadUserResponseBody body;

    public static AddKnowledgeUploadUserResponse build(java.util.Map<String, ?> map) throws Exception {
        AddKnowledgeUploadUserResponse self = new AddKnowledgeUploadUserResponse();
        return TeaModel.build(map, self);
    }

    public AddKnowledgeUploadUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddKnowledgeUploadUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddKnowledgeUploadUserResponse setBody(AddKnowledgeUploadUserResponseBody body) {
        this.body = body;
        return this;
    }
    public AddKnowledgeUploadUserResponseBody getBody() {
        return this.body;
    }

}

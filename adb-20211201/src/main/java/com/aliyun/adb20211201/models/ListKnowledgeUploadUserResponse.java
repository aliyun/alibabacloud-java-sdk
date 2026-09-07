// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ListKnowledgeUploadUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListKnowledgeUploadUserResponseBody body;

    public static ListKnowledgeUploadUserResponse build(java.util.Map<String, ?> map) throws Exception {
        ListKnowledgeUploadUserResponse self = new ListKnowledgeUploadUserResponse();
        return TeaModel.build(map, self);
    }

    public ListKnowledgeUploadUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListKnowledgeUploadUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListKnowledgeUploadUserResponse setBody(ListKnowledgeUploadUserResponseBody body) {
        this.body = body;
        return this;
    }
    public ListKnowledgeUploadUserResponseBody getBody() {
        return this.body;
    }

}

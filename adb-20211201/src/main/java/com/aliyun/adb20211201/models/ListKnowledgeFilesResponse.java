// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ListKnowledgeFilesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListKnowledgeFilesResponseBody body;

    public static ListKnowledgeFilesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListKnowledgeFilesResponse self = new ListKnowledgeFilesResponse();
        return TeaModel.build(map, self);
    }

    public ListKnowledgeFilesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListKnowledgeFilesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListKnowledgeFilesResponse setBody(ListKnowledgeFilesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListKnowledgeFilesResponseBody getBody() {
        return this.body;
    }

}

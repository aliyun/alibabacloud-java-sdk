// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ListTextbookAssistantBookDirectoriesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTextbookAssistantBookDirectoriesResponseBody body;

    public static ListTextbookAssistantBookDirectoriesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTextbookAssistantBookDirectoriesResponse self = new ListTextbookAssistantBookDirectoriesResponse();
        return TeaModel.build(map, self);
    }

    public ListTextbookAssistantBookDirectoriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTextbookAssistantBookDirectoriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTextbookAssistantBookDirectoriesResponse setBody(ListTextbookAssistantBookDirectoriesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTextbookAssistantBookDirectoriesResponseBody getBody() {
        return this.body;
    }

}

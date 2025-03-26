// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ListTextbookAssistantBooksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTextbookAssistantBooksResponseBody body;

    public static ListTextbookAssistantBooksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTextbookAssistantBooksResponse self = new ListTextbookAssistantBooksResponse();
        return TeaModel.build(map, self);
    }

    public ListTextbookAssistantBooksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTextbookAssistantBooksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTextbookAssistantBooksResponse setBody(ListTextbookAssistantBooksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTextbookAssistantBooksResponseBody getBody() {
        return this.body;
    }

}

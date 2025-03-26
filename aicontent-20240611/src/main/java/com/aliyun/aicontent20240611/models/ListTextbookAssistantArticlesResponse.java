// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ListTextbookAssistantArticlesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTextbookAssistantArticlesResponseBody body;

    public static ListTextbookAssistantArticlesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTextbookAssistantArticlesResponse self = new ListTextbookAssistantArticlesResponse();
        return TeaModel.build(map, self);
    }

    public ListTextbookAssistantArticlesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTextbookAssistantArticlesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTextbookAssistantArticlesResponse setBody(ListTextbookAssistantArticlesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTextbookAssistantArticlesResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ListTextbookAssistantArticleDetailsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTextbookAssistantArticleDetailsResponseBody body;

    public static ListTextbookAssistantArticleDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTextbookAssistantArticleDetailsResponse self = new ListTextbookAssistantArticleDetailsResponse();
        return TeaModel.build(map, self);
    }

    public ListTextbookAssistantArticleDetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTextbookAssistantArticleDetailsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTextbookAssistantArticleDetailsResponse setBody(ListTextbookAssistantArticleDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTextbookAssistantArticleDetailsResponseBody getBody() {
        return this.body;
    }

}

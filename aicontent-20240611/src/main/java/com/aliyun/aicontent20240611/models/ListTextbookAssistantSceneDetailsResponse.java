// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ListTextbookAssistantSceneDetailsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTextbookAssistantSceneDetailsResponseBody body;

    public static ListTextbookAssistantSceneDetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTextbookAssistantSceneDetailsResponse self = new ListTextbookAssistantSceneDetailsResponse();
        return TeaModel.build(map, self);
    }

    public ListTextbookAssistantSceneDetailsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTextbookAssistantSceneDetailsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTextbookAssistantSceneDetailsResponse setBody(ListTextbookAssistantSceneDetailsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTextbookAssistantSceneDetailsResponseBody getBody() {
        return this.body;
    }

}

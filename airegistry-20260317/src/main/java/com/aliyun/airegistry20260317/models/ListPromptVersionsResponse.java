// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airegistry20260317.models;

import com.aliyun.tea.*;

public class ListPromptVersionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPromptVersionsResponseBody body;

    public static ListPromptVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPromptVersionsResponse self = new ListPromptVersionsResponse();
        return TeaModel.build(map, self);
    }

    public ListPromptVersionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPromptVersionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPromptVersionsResponse setBody(ListPromptVersionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPromptVersionsResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airegistry20260317.models;

import com.aliyun.tea.*;

public class ListPromptsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPromptsResponseBody body;

    public static ListPromptsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPromptsResponse self = new ListPromptsResponse();
        return TeaModel.build(map, self);
    }

    public ListPromptsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPromptsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPromptsResponse setBody(ListPromptsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPromptsResponseBody getBody() {
        return this.body;
    }

}

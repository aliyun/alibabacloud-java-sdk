// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListAiModelCardsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAiModelCardsResponseBody body;

    public static ListAiModelCardsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAiModelCardsResponse self = new ListAiModelCardsResponse();
        return TeaModel.build(map, self);
    }

    public ListAiModelCardsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAiModelCardsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAiModelCardsResponse setBody(ListAiModelCardsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAiModelCardsResponseBody getBody() {
        return this.body;
    }

}

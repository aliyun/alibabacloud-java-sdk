// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListModelCardsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListModelCardsResponseBody body;

    public static ListModelCardsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListModelCardsResponse self = new ListModelCardsResponse();
        return TeaModel.build(map, self);
    }

    public ListModelCardsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListModelCardsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListModelCardsResponse setBody(ListModelCardsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListModelCardsResponseBody getBody() {
        return this.body;
    }

}

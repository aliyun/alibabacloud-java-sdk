// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class ListTagResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListTagResponseBody body;

    public static ListTagResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTagResponse self = new ListTagResponse();
        return TeaModel.build(map, self);
    }

    public ListTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListTagResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListTagResponse setBody(ListTagResponseBody body) {
        this.body = body;
        return this;
    }
    public ListTagResponseBody getBody() {
        return this.body;
    }

}

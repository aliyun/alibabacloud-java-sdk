// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class ListLgfResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListLgfResponseBody body;

    public static ListLgfResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLgfResponse self = new ListLgfResponse();
        return TeaModel.build(map, self);
    }

    public ListLgfResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLgfResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLgfResponse setBody(ListLgfResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLgfResponseBody getBody() {
        return this.body;
    }

}

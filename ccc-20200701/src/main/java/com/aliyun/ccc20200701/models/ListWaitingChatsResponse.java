// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListWaitingChatsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListWaitingChatsResponseBody body;

    public static ListWaitingChatsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListWaitingChatsResponse self = new ListWaitingChatsResponse();
        return TeaModel.build(map, self);
    }

    public ListWaitingChatsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListWaitingChatsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListWaitingChatsResponse setBody(ListWaitingChatsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListWaitingChatsResponseBody getBody() {
        return this.body;
    }

}

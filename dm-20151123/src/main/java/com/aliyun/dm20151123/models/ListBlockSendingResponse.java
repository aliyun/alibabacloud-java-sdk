// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class ListBlockSendingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListBlockSendingResponseBody body;

    public static ListBlockSendingResponse build(java.util.Map<String, ?> map) throws Exception {
        ListBlockSendingResponse self = new ListBlockSendingResponse();
        return TeaModel.build(map, self);
    }

    public ListBlockSendingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListBlockSendingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListBlockSendingResponse setBody(ListBlockSendingResponseBody body) {
        this.body = body;
        return this;
    }
    public ListBlockSendingResponseBody getBody() {
        return this.body;
    }

}

// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListConsumersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListConsumersResponseBody body;

    public static ListConsumersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListConsumersResponse self = new ListConsumersResponse();
        return TeaModel.build(map, self);
    }

    public ListConsumersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListConsumersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListConsumersResponse setBody(ListConsumersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListConsumersResponseBody getBody() {
        return this.body;
    }

}

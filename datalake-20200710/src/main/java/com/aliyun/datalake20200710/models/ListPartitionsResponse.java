// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class ListPartitionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPartitionsResponseBody body;

    public static ListPartitionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPartitionsResponse self = new ListPartitionsResponse();
        return TeaModel.build(map, self);
    }

    public ListPartitionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPartitionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPartitionsResponse setBody(ListPartitionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPartitionsResponseBody getBody() {
        return this.body;
    }

}

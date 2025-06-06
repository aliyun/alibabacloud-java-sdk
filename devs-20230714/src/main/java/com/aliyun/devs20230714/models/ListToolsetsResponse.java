// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class ListToolsetsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListToolsetsResponseBody body;

    public static ListToolsetsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListToolsetsResponse self = new ListToolsetsResponse();
        return TeaModel.build(map, self);
    }

    public ListToolsetsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListToolsetsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListToolsetsResponse setBody(ListToolsetsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListToolsetsResponseBody getBody() {
        return this.body;
    }

}
